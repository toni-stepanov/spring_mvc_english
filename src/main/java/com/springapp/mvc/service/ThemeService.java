package com.springapp.mvc.service;

import com.springapp.mvc.entity.Theme;
import com.springapp.mvc.entity.User;
import com.springapp.mvc.entity.Word;
import com.springapp.mvc.repository.RoleRepository;
import com.springapp.mvc.repository.ThemeRepository;
import com.springapp.mvc.repository.UserRepository;
import com.springapp.mvc.repository.WordRepository;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ThemeService {

    @Autowired
    private ThemeRepository themeRepository;

    public Theme findByTitle(String face) {
        Theme theme = themeRepository.findByTitle(face);
        return theme;
    }

    @Cacheable(value = "themes")
    public List<Theme> findAll() {
        return themeRepository.findAll();
    }
}
