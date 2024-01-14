package com.kuab.application.application.adapters;

import com.kuab.application.application.adapters.course.entity.CourseEntity;
import com.kuab.application.domain.course.model.Course;

public class toEntity {

    public static Course convert(CourseEntity c) {
        Course course = new Course();
        return course;
    }

}
