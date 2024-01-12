package com.kuab.application.domain.course;

import java.util.List;

public class CourseService implements CoursePort{

    CourseDatabasePort port;
    public CourseService(CourseDatabasePort port) {
        this.port = port;
    }
    @Override
    public List<Course> getCourses() {
        return port.find();
    }
}
