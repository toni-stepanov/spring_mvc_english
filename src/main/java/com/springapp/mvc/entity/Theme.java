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
	private List<Word> words;

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

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
}
