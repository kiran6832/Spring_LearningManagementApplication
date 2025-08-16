package com.lms.course_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.course_service.entity.Course;
import com.lms.course_service.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/create")
	public ResponseEntity<Course> createCourse(@RequestBody Course course) {
		return ResponseEntity.ok(courseService.createCourse(course));
	}
	
	@GetMapping
	public ResponseEntity<List<Course>> getAll(){
		return ResponseEntity.ok(courseService.getAllCourses());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Course> getById(@PathVariable Long id) {
		return  ResponseEntity.ok(courseService.getCourseById(id));
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to the course";
	}

}
