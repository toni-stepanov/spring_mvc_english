package com.springapp.mvc.controller;

import com.springapp.mvc.entity.User;
import com.springapp.mvc.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class UserListController {

    @Autowired
    UserService userService;

    private static Logger logger = Logger.getLogger(UserListController.class);

    @RequestMapping("/users")
    public String users(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        logger.info("users");
        return "users";
    }


}
