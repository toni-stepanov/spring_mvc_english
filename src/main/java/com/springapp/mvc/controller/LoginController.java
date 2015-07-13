package com.springapp.mvc.controller;


import com.springapp.mvc.entity.Person;
import com.springapp.mvc.service.PersonService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LoginController {

    private static Logger logger = Logger.getLogger(LoginController.class);

    @Autowired
    PersonService personService;

    @RequestMapping("/test")
    public String detail(Model model) {
        List<Person> persons = personService.findAll();
        for (Person person : persons) {
            logger.info(person.toString());
        }
        return "start";
    }

    @RequestMapping("/")
    public String detail2(Model model) {
        return "start";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String loginCheck(Model model, @RequestParam String mail) {
        logger.info("loginCheck mail = " + mail);
        Person person = personService.findByMail(mail);
        logger.info("person = " + person);
        return "start";
    }

}
