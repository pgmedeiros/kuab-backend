package com.kuab.application.domain.course.ports.out;

import com.kuab.application.domain.course.model.Course;

import java.util.List;

public interface CourseDatabasePort {

    List<Course> find();
}
