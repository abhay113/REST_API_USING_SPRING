package com.example.RestFul.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestFul.Dao.CourseDao;
import com.example.RestFul.entity.Courses;

@Service
public class CourseServiceImp implements CourseService {
	// List<Courses> list;

	@Autowired
	private CourseDao cd;

	public CourseServiceImp() {
//		list = new ArrayList<>();
//		list.add(new Courses(101, "Java", "3 months", 15000));
//		list.add(new Courses(121, "Python", "2 months", 7500));

	}

	@Override
	public List<Courses> getCourse() {
//		return list;
		return cd.findAll();
	}


	@Override
	public Courses getCourse(int CourseId) {
//		Courses c = null;
//		for (Courses course : list) {
//			if (course.getCid() == CourseId) {
//				c = course;
//				break;
//			}
//		}
//		return c;
		return cd.getReferenceById(CourseId);
				}

	@Override
	public Courses addCourse(Courses c) {
//		list.add(c);
//		return c;

		cd.save(c);
		return c;
	}

	@Override
	public Courses updateCourse(Courses c) {

//		list.forEach(e -> {
//			if (e.getCid() == c.getCid()) {
//				e.setName(c.getName());
//				e.setDuration(c.getDuration());
//				e.setFees(e.getFees());
//			}
//		});
//		return c;
		cd.save(c);
		return c;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void deleteCourse(int parseInt) {
		// list = this.list.stream().filter(e -> e.getCid() !=
		// parseInt).collect(Collectors.toList());
		Courses c1 = cd.getById(parseInt);
		cd.delete(c1);
	}
}
