package com.springapp.mvc;



import com.springapp.mvc.model.Person;
import com.springapp.mvc.service.PersonService;
import com.springapp.mvc.service.PersonServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MainController {
    private static final Logger logger = Logger.getLogger(MainController.class);

    private PersonService personService;

    @Autowired(required=true)
    @Qualifier(value="personService")
    public void setPersonService(PersonService ps){
        this.personService = ps;
    }

    @RequestMapping(method = RequestMethod.GET, value="/")
    public String start(ModelMap model) {

        return "start";
    }

    @RequestMapping(method = RequestMethod.GET, value="/db")
    public String test_db(ModelMap model) {
        Person person = new Person();
        person.setCountry("Germany");
        person.setName("Anton");
        this.personService.addPerson(person);
        return "start";
    }



}