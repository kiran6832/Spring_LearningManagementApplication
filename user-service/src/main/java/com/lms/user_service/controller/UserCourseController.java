package com.lms.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.user_service.clients.CourseClient;

@RestController
@RequestMapping("/user")
public class UserCourseController {
	@Autowired
	private CourseClient courseClient;
	
	@GetMapping("/welcome")
	public String getCourseWelcome() {
		return courseClient.getWelcome();
	}


}
