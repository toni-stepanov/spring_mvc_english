package com.springapp.mvc.controller;


import com.springapp.mvc.entity.Person;
import com.springapp.mvc.service.PersonService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LoginController {

    private static Logger logger = Logger.getLogger(LoginController.class);

    @Autowired
    PersonService personService;

    @RequestMapping("/")
    public String start(Model model) {
        logger.info("start");
        return "start";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        logger.info("login");
        return "login";
    }

    @RequestMapping("/registration")
    public String register(Model model) {
        logger.info("registration");
        return "registration";
    }

    @ModelAttribute("person")
    public Person create(){
        logger.info("create person");
        return new Person();
    }

    @RequestMapping(value = "registration", method = RequestMethod.POST)
    public String doRegister(@Valid @ModelAttribute("person") Person person, Model model) {
        personService.save(person);
        model.addAttribute("person", person);
        logger.info("do register mail = " + person.getMail());
        return "start";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String loginCheck(Model model, @RequestParam String mail, @RequestParam String pwd) {
        logger.info("loginCheck mail = " + mail);
        logger.info("loginCheck pwd = " + pwd);
        Person person = personService.findByMail(mail);
        logger.info("person = " + person);
        if(person.getPassword().equals(pwd)){
            model.addAttribute("person", person);
            return "start";
        }
        model.addAttribute("result", "Incorrect password");
        return "login";
    }

}
