package com.springapp.mvc.repository;

import com.springapp.mvc.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Integer>{


}
