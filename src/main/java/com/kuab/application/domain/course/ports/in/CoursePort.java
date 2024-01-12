package com.kuab.application.domain.course.ports.in;

import com.kuab.application.domain.course.model.Course;

import java.util.List;

public interface CoursePort {

    List<Course> getCourses();

}
