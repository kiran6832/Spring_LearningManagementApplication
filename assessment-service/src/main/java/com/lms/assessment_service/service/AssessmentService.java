package com.lms.assessment_service.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.lms.assessment_service.entity.Assessment;
import com.lms.assessment_service.repository.AssessmentRepository;
import org.springframework.stereotype.Service;
@Service
public class AssessmentService {

    @Autowired
    private AssessmentRepository assessmentRepository;

    public Assessment createAssessment(Assessment assessment) {
        return assessmentRepository.save(assessment);
    }

    public List<Assessment> getAssessmentsByCourseId(Long courseId) {
        return assessmentRepository.findByCourseId(courseId);
    }

    public Optional<Assessment> getById(Long id) {
        return assessmentRepository.findById(id);
    }

	
}
