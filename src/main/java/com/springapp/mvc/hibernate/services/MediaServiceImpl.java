package com.springapp.mvc.hibernate.services;

import com.springapp.mvc.hibernate.dao.MediaDao;
import com.springapp.mvc.hibernate.models.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("storageService")
public class MediaServiceImpl implements MediaService {

    @Autowired
    private MediaDao dao;

    @Transactional
    @Override
    public void save(Content content) {
        dao.save(content);
    }

    @Override
    public List<Content> getAll() {
        return dao.getAll();
    }
}
