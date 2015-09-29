package com.springapp.mvc.controller;


import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.services.youtube.YouTube;
import com.google.gdata.client.youtube.YouTubeService;
import com.google.gdata.data.youtube.PlaylistLinkEntry;
import com.google.gdata.data.youtube.PlaylistLinkFeed;
import com.google.gdata.util.ServiceException;
import com.springapp.mvc.entity.Student;
import com.springapp.mvc.service.UserService;
import com.springapp.mvc.tools.Auth;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

//import com.google.api.services.samples.youtube.cmdline.Auth;

@Controller
public class LoginController {

    private static Logger logger = Logger.getLogger(LoginController.class);

    /**
     * Define a global instance of a Youtube object, which will be used
     * to make YouTube Data API requests.
     */
    private static YouTube youtube;

    /**
     * Define a global variable that identifies the name of a file that
     * contains the developer's API key.
     */
    private static final String PROPERTIES_FILENAME = "youtube.properties";

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login(Model model) {
        logger.info("login");
        return "login";
    }

    @RequestMapping("/login/result/listjson")
    @ResponseBody
    public List<Student> ajax(Model model) {
        logger.info("login!");
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("test", "dsad"));
        students.add(new Student("test2", "dsad2"));
        students.add(new Student("test3", "dsad3"));

        return students;
    }


    public static void main(String[] args) throws MalformedURLException {
        // Read the developer key from the properties file.
        Properties properties = new Properties();
        try {
            InputStream in = LoginController.class.getResourceAsStream("/" + PROPERTIES_FILENAME);
            properties.load(in);

        } catch (IOException e) {
            logger.error("There was an error reading " + PROPERTIES_FILENAME + ": " + e.getCause()
                    + " : " + e.getMessage());
            System.exit(1);
        }

        // This object is used to make YouTube Data API requests. The last
        // argument is required, but since we don't need anything
        // initialized when the HttpRequest is initialized, we override
        // the interface and provide a no-op function.
        youtube = new YouTube.Builder(Auth.HTTP_TRANSPORT, Auth.JSON_FACTORY, new HttpRequestInitializer() {
            public void initialize(HttpRequest request) throws IOException {
            }
        }).setApplicationName("youtube-cmdline-search-sample").build();
        logger.info("Created!");
//        youtube.playlists()
        String feedUrl = "http://gdata.youtube.com/feeds/api/users/YTdebates/playlists";
        YouTubeService service = new YouTubeService("The name of my application");


        PlaylistLinkFeed feed = null;
        try {
            feed = service.getFeed(new URL(feedUrl), PlaylistLinkFeed.class);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        for(PlaylistLinkEntry entry : feed.getEntries()) {
            System.out.println("Title: " + entry.getTitle().getPlainText());
            System.out.println("Description: " + entry.getSummary().getPlainText());
            System.out.println("Number of entries: " + entry.getCountHint());
        }

    }

}
