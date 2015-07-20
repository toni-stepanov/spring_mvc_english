package com.springapp.mvc.controller;

import com.springapp.mvc.entity.User;
import com.springapp.mvc.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class RegisterController {

    private static Logger logger = Logger.getLogger(RegisterController.class);

    @Autowired
    UserService userService;

    @ModelAttribute("user")
    public User create(){
        logger.info("create user");
        return new User();
    }

    @RequestMapping(value = "registration", method = RequestMethod.POST)
    public String doRegister(@Valid @ModelAttribute("user") User user, Model model) {
        userService.save(user);
        model.addAttribute("user", user);
        logger.info("do register mail = " + user.getMail());
        return "login";
    }

    @RequestMapping(value = "registration")
    public String registration(){
        return "registration";
    }

}
