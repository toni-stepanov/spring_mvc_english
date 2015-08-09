package com.springapp.mvc.controller;

import javax.validation.Valid;

import com.springapp.mvc.entity.User;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/registration")
public class RegisterController {

    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public User constructUser() {
        System.out.println("user");
        return new User();
    }

    @RequestMapping
    public String showRegister() {
        return "registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doRegister(@Valid @ModelAttribute("user") User user, BindingResult result) {
        System.out.println("!!!!");
        userService.save(user);
        return "login";
    }

    @RequestMapping("/available")
    @ResponseBody
    public String available(@RequestParam String email) {
        System.out.println("available");
        Boolean available = (userService.findByEmail(email) == null);
        return available.toString();
    }

}
