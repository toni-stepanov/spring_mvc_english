package com.springapp.mvc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

    private static Logger logger = Logger.getLogger(StartController.class);

    @RequestMapping("/")
    public String start(Model model) {
        logger.info("start!!");
        return "start";
    }



}
