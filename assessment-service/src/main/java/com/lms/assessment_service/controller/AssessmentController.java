package com.lms.assessment_service.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.lms.assessment_service.entity.Assessment;
import com.lms.assessment_service.entity.Submission;
import com.lms.assessment_service.service.AssessmentService;
import com.lms.assessment_service.service.SubmissionService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/assessments")
public class AssessmentController {

    @Autowired
    private AssessmentService assessmentService;

    @Autowired
    private SubmissionService submissionService;

    @PostMapping
    public ResponseEntity<Assessment> create(@RequestBody Assessment assessment) {
        return ResponseEntity.ok(assessmentService.createAssessment(assessment));
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<Assessment>> getByCourse(@PathVariable Long courseId) {
        return ResponseEntity.ok(assessmentService.getAssessmentsByCourseId(courseId));
    }


    @PostMapping("/submit")
    public ResponseEntity<Submission> submit(@RequestBody Submission submission) {
        return ResponseEntity.ok(submissionService.submitAnswer(submission));
    }

    // 4. Get submissions by user
    @GetMapping("/submissions/user/{userId}")
    public ResponseEntity<List<Submission>> getByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(submissionService.getSubmissionsByUser(userId));
    }

 
    @GetMapping("/submissions/assessment/{assessmentId}")
    public ResponseEntity<List<Submission>> getByAssessment(@PathVariable Long assessmentId) {
        return ResponseEntity.ok(submissionService.getSubmissionsByAssessment(assessmentId));
    }
}
