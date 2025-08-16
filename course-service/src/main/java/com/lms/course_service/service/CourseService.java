package com.lms.course_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.course_service.entity.Course;
import com.lms.course_service.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public Course createCourse(Course course) {
		return courseRepository.save(course);
	}
	public List<Course> getAllCourses(){
		List<Course> courses=courseRepository.findAll();
		return courses;
	}
	
	public Course getCourseById(Long id) {
		Course course=courseRepository.findById(id).orElseThrow(()->new RuntimeException("course not found"));
		return course;
	}
	


}
