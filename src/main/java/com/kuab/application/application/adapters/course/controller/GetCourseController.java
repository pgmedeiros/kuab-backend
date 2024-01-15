package com.kuab.application.application.adapters.course.controller;

import com.kuab.application.domain.course.model.Course;
import com.kuab.application.domain.course.ports.in.GetCourseUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class GetCourseController {

    private final GetCourseUseCase getCourseUseCase;

    public GetCourseController(GetCourseUseCase getCourseUseCase) {
        this.getCourseUseCase = getCourseUseCase;
    }

    @GetMapping("/")
    public List<Course> getCourses(UUID id) {
       return getCourseUseCase.getCourses();
    }


}
