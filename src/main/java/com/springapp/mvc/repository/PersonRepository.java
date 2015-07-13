package com.springapp.mvc.repository;

import java.util.List;

import com.springapp.mvc.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer>{

    List<Person> findAll();

    Person findByMail(String mail);
}
