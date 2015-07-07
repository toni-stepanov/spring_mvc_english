package com.springapp.mvc.hibernate.dao;

import com.springapp.mvc.hibernate.models.Content;

import java.util.List;

public interface MediaDao {

    public void save(Content content);
    public List<Content> getAll();

}
