package com.springapp.mvc.service;

import com.springapp.mvc.entity.Person;
import com.springapp.mvc.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findByMail(String mail) {
        return personRepository.findByMail(mail);
    }

}
