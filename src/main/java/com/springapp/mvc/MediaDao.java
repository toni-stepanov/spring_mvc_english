package com.springapp.mvc;

import java.util.List;

public interface MediaDao {

    public void save(Content content);
    public List<Content> getAll();

}
