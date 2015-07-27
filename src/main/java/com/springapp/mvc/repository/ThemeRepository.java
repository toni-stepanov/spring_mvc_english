package com.springapp.mvc.repository;

import com.springapp.mvc.entity.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThemeRepository extends JpaRepository<Theme, Integer>{

//    Theme findByTitleWithWords(String title);

    Theme findByTitle(String title);
}
