package com.springapp.mvc.repository;

import com.springapp.mvc.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer>{

    Person findByMail(String mail);
}
