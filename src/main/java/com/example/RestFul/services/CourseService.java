package com.example.RestFul.services;

import java.util.List;

import com.example.RestFul.entity.Courses;

public interface CourseService {
	public List<Courses> getCourse();
	public Courses getCourse(int CourseId);
	public Courses addCourse(Courses c);
	public Courses updateCourse(Courses c);
	public void deleteCourse(int parseInt);
}
