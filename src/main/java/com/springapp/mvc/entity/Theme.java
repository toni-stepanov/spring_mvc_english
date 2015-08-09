package com.springapp.mvc.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Theme {

	@Id
	@GeneratedValue
	private Integer id;

	private String title;

    @ManyToMany
    @JoinTable
	private List<Lesson> lessons;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
}
