package com.example.RestFul.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.RestFul.entity.*;

public interface CourseDao extends JpaRepository<Courses, Integer> {

}
