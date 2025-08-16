package com.lms.content_service.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import com.lms.content_service.entity.Content;
import com.lms.content_service.service.ContentService;

@RestController
@RequestMapping("/contents")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @PostMapping
    public ResponseEntity<Content> addContent(@RequestBody Content content) {
        return new ResponseEntity<>(contentService.saveContent(content), HttpStatus.CREATED);
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<Content>> getContentsByCourse(@PathVariable Long courseId) {
        return ResponseEntity.ok(contentService.getContentByCourse(courseId));
    }
}
