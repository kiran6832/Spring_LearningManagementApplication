package com.lms.enrollment_service.dto;


public class EnrollmentResponce {
    private UserDTO user;
    private CourseDTO course;
    
    public EnrollmentResponce(UserDTO user, CourseDTO course) {
        this.user = user;
        this.course = course;
    }
 
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public CourseDTO getCourse() {
		return course;
	}
	public void setCourse(CourseDTO course) {
		this.course = course;
	}

    
}
