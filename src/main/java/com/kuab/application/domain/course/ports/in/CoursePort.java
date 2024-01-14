package com.kuab.application.domain.course.ports.in;

import com.kuab.application.domain.course.model.Course;

import java.util.List;
import java.util.UUID;

public interface CoursePort {

    List<Course> getCourses();

}
