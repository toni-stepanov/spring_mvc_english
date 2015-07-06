package com.springapp.mvc;



import com.springapp.mvc.hibernate.models.Book;
import com.springapp.mvc.hibernate.models.Content;
import com.springapp.mvc.hibernate.models.Music;
import com.springapp.mvc.hibernate.services.MediaService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {
    private static final Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping(method = RequestMethod.GET, value="/")
    public String start(ModelMap model) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
        MediaService service = (MediaService) context.getBean("storageService");
        service.save(getBook());
        service.save(getTrack());
        logger.info("Список всех элементов библиотеки мультимедиа:");
        for (Content content : service.getAll()) {
            logger.info(content);
        }
        return "start";
    }


    private static Content getBook() {
        Book book = new Book();
        book.setTitle("Над пропастью во ржи");
        book.getAuthor().setFirstName("Джером");
        book.getAuthor().setMiddleName("Дэвид");
        book.getAuthor().setLastName("Сэлинджер");
        book.setPageCount(500);
        return book;
    }

    private static Content getTrack() {
        Music track = new Music();
        track.setTitle("Moby - Lift Me Up");
        track.getAuthor().setFirstName("Ричард");
        track.getAuthor().setMiddleName("Мэлвилл");
        track.getAuthor().setLastName("Холл");
        track.setBitRate(256);
        return track;
    }

//    @RequestMapping(method = RequestMethod.GET, value="/")
//    public String hiber_test(ModelMap model) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
//        return "";
//    }

}