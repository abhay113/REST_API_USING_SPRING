package com.example.RestFul.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.RestFul.entity.Courses;
import com.example.RestFul.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService cs;

	@GetMapping("/home")
	public String home() {
		return "acchha thile bhaii ";
	}

	@GetMapping("/courses")
	public List<Courses> getCourses() {
		return this.cs.getCourse();

	}

	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.cs.getCourse(Integer.parseInt(courseId));

	}

	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses c) {
		return this.cs.addCourse(c);
	}
	
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses c) {
		return this.cs.updateCourse(c);
	}
	
	
}


















