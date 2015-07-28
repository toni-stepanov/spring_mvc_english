package com.springapp.mvc.controller;


import com.springapp.mvc.entity.Theme;
import com.springapp.mvc.entity.Word;
import com.springapp.mvc.service.ThemeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ThemeController {

    private static Logger logger = Logger.getLogger(ThemeController.class);

    @Autowired
    ThemeService themeService;

    @RequestMapping(value = "themes")
    public String main(Model model) {
        logger.info("main");
        List<Theme> themes = themeService.findAll();
        model.addAttribute("themes", themes);
        return "themes";
    }

    @RequestMapping(value = "/thems/{theme}")
    public String chooseTheme(Model model,@PathVariable String theme){
        logger.info("choose theme = " + theme);
        Theme currentTheme = themeService.findByTitle(theme);
        model.addAttribute("theme", currentTheme);
        Word currentWord = currentTheme.getWords().iterator().next();
        model.addAttribute("word", currentWord);
        List<Theme> themes = themeService.findAll();
        model.addAttribute("themes", themes);
        model.addAttribute("currentIndex", 1);
        model.addAttribute("currentTheme", theme);
        return "chosen_theme";
    }

    @RequestMapping(value = "/thems/{theme}/{currentIndex}")
    public String getNextPrevWord(Model model, @PathVariable String theme, @PathVariable int currentIndex){
        logger.info("getNextPrevWord index = " + currentIndex);
        Theme currentTheme = themeService.findByTitle(theme);
        model.addAttribute("theme", currentTheme);
        List<Word> words = currentTheme.getWords();
        Word currentWord = null;
        if(!words.isEmpty() && words.size() >= currentIndex){
            currentWord = words.get(currentIndex - 1);
        }
        model.addAttribute("word", currentWord);
        List<Theme> themes = themeService.findAll();
        model.addAttribute("themes", themes);
        model.addAttribute("currentIndex", currentIndex);
        model.addAttribute("currentTheme", theme);
        return "chosen_theme";
    }

}
