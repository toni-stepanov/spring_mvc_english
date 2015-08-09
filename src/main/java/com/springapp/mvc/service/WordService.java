package com.springapp.mvc.service;

import com.springapp.mvc.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class WordService {

    @Autowired
    private LessonRepository lessonRepository;

//    public List<Lesson> findByTitle(String face) {
//        List<Lesson> words = lessonRepository.findByTheme();
//        return words;
//    }

}
