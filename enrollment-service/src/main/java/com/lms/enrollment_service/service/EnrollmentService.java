package com.lms.enrollment_service.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.enrollment_service.client.CourseClient;
import com.lms.enrollment_service.client.UserClient;
import com.lms.enrollment_service.dto.CourseDTO;
import com.lms.enrollment_service.dto.EnrollmentResponce;
import com.lms.enrollment_service.dto.UserDTO;
import com.lms.enrollment_service.entity.Enrollment;
import com.lms.enrollment_service.repository.EnrollmentRepository;

@Service
public class EnrollmentService {
	
	@Autowired
	private CourseClient courseClient;
	
	@Autowired
	private UserClient userClient;
	
	@Autowired
	private EnrollmentRepository enrollmentRepository;
	
	
	public EnrollmentResponce enrollUser(Long userId, Long courseId) {
	    UserDTO user = userClient.getUserById(userId);
	    CourseDTO course = courseClient.getCourseById(courseId);

	    Enrollment enrollment = new Enrollment();
	    enrollment.setUserId(userId);
	    enrollment.setCourseId(courseId);
	    enrollment.setEnrollmentDate(LocalDate.now());
	    enrollmentRepository.save(enrollment);  
	    return new EnrollmentResponce(user, course);
	}


}
