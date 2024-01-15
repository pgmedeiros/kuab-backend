package com.kuab.application.domain.course.services;

import com.kuab.application.domain.course.model.Course;
import com.kuab.application.domain.course.ports.out.CourseRepository;
import com.kuab.application.domain.course.ports.in.GetCourseUseCase;

import java.util.List;

public class GetCourseService implements GetCourseUseCase {

    private final CourseRepository port;
    public GetCourseService(CourseRepository port) {
        this.port = port;
    }
    @Override
    public List<Course> getCourses() {

        return port.find();
    }
}
