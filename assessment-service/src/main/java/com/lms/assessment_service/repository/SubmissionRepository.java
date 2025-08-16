package com.lms.assessment_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.assessment_service.entity.Assessment;
import com.lms.assessment_service.entity.Submission;


public interface SubmissionRepository extends JpaRepository<Submission, Long> {
	List<Submission> findByUserId(Long userId);
	List<Submission> findByAssessment(Assessment assessment);

}
