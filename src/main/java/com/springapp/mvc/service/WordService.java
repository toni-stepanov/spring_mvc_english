package com.springapp.mvc.service;

import com.springapp.mvc.entity.Theme;
import com.springapp.mvc.entity.Word;
import com.springapp.mvc.repository.ThemeRepository;
import com.springapp.mvc.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class WordService {

    @Autowired
    private WordRepository wordRepository;

//    public List<Word> findByTitle(String face) {
//        List<Word> words = wordRepository.findByTheme();
//        return words;
//    }

}
