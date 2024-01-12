package com.kuab.application.domain.course.services;

import com.kuab.application.domain.course.model.Course;
import com.kuab.application.domain.course.ports.out.CourseDatabasePort;
import com.kuab.application.domain.course.ports.in.CoursePort;

import java.util.List;

public class CourseService implements CoursePort {

    CourseDatabasePort port;
    public CourseService(CourseDatabasePort port) {
        this.port = port;
    }
    @Override
    public List<Course> getCourses() {
        return port.find();
    }
}
