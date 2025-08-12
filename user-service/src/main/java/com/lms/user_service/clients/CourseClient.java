package com.lms.user_service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "course-service") 
public interface CourseClient {

    @GetMapping("/courses/welcome")
    String getWelcome();
}
