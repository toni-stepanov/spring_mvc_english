package com.springapp.mvc.repository;

import com.springapp.mvc.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Integer>{


}
