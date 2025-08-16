package com.lms.assessment_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.assessment_service.entity.Assessment;

public interface AssessmentRepository extends JpaRepository<Assessment, Long> {
	List<Assessment> findByCourseId(Long courseId);

}
