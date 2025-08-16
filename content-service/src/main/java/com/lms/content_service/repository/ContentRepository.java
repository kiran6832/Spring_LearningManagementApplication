package com.lms.content_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.content_service.entity.Content;

public interface ContentRepository extends JpaRepository<Content, Long> {
	List<Content> findByCourseId(Long courseId);

}
