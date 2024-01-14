package com.kuab.application.domain.course.ports.out;

import com.kuab.application.domain.course.model.Course;

import java.util.List;
import java.util.UUID;

public interface CourseDatabasePort {

    List<Course> find();
}
