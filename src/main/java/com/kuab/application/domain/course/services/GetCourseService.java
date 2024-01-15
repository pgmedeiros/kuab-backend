package com.kuab.application.domain.course.services;

import com.kuab.application.domain.course.model.Course;
import com.kuab.application.domain.course.ports.out.CourseDatabasePort;
import com.kuab.application.domain.course.ports.in.GetCourseUseCase;

import java.util.List;

public class GetCourseService implements GetCourseUseCase {

    private final CourseDatabasePort port;
    public GetCourseService(CourseDatabasePort port) {
        this.port = port;
    }
    @Override
    public List<Course> getCourses() {

        return port.find();
    }
}
