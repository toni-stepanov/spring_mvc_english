package com.springapp.mvc.controller;


import com.springapp.mvc.entity.Theme;
import com.springapp.mvc.service.ThemeService;
import com.springapp.mvc.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {

    private static Logger logger = Logger.getLogger(MainController.class);

    @Autowired
    ThemeService themeService;

    @RequestMapping(value = "main")
    public String main(Model model) {
        logger.info("main");
        List<Theme> themes = themeService.findAll();
        model.addAttribute("themes", themes);
        return "main";
    }

    @RequestMapping(value = "/thems/{theme}")
    public String chooseTheme(Model model,@PathVariable String theme){
        logger.info("choose theme = " + theme);
        Theme currentTheme = themeService.findByTitle(theme);
        currentTheme.getWords();
        logger.info("theme words size = " + currentTheme.getWords().size());
        model.addAttribute("words", currentTheme.getWords());
        return "main";
    }

}
