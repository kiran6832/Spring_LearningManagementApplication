package com.lms.course_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.course_service.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
