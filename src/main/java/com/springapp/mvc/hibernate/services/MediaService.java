package com.springapp.mvc.hibernate.services;

import com.springapp.mvc.hibernate.models.Content;

import java.util.List;

public interface MediaService {

    /**
     * Сохраняет элемент в библиотеке
     * @param content Элемент библиотеки (книга или аудиозапись)
     */
    public void save(Content content);

    /**
     * Возвращает все элементы, о которых есть данные в библиотеке
     * @return Список элементов библиотеки
     */
    public List<Content> getAll();

}
