package com.lms.content_service.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.lms.content_service.client.CourseClient;
import com.lms.content_service.entity.Content;
import com.lms.content_service.repository.ContentRepository;
import org.springframework.stereotype.Service;

@Service
public class ContentService {

    @Autowired
    private ContentRepository contentRepository;

    @Autowired
    private CourseClient courseClient;

    public Content saveContent(Content content) {
        courseClient.getCourseById(content.getCourseId()); // Validate course exists
        return contentRepository.save(content);
    }

    public List<Content> getContentByCourse(Long courseId) {
        return contentRepository.findByCourseId(courseId);
    }
}
