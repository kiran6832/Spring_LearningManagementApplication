package com.lms.assessment_service.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.lms.assessment_service.entity.Assessment;
import com.lms.assessment_service.entity.Submission;
import com.lms.assessment_service.repository.SubmissionRepository;
import org.springframework.stereotype.Service;
@Service
public class SubmissionService {

    @Autowired
    private SubmissionRepository submissionRepository;
    
    @Autowired
    private AssessmentService assessmentService;

    public Submission submitAnswer(Submission submission) {
        submission.setSubmittedAt(LocalDate.now());
        return submissionRepository.save(submission);
    }

    public List<Submission> getSubmissionsByUser(Long userId) {
        return submissionRepository.findByUserId(userId);
    }

    public List<Submission> getSubmissionsByAssessment(Long assessmentId) {
        Optional<Assessment> optionalAssessment = assessmentService.getById(assessmentId);
        
        if (optionalAssessment.isEmpty()) {
            throw new RuntimeException("Assessment not found");
        }

        Assessment assessment = optionalAssessment.get();
        return submissionRepository.findByAssessment(assessment);
    }
}
