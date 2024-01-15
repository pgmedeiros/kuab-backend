package com.kuab.application.application.adapters.common;

import com.kuab.application.application.adapters.course.repository.CourseJpaTable;
import com.kuab.application.domain.course.model.Course;

public class EntityToModel {

    public static Course convert(CourseJpaTable c) {
        Course course = new Course();
        course.setID(c.getId());
        course.setDescription(c.getDescription());
        return course;
    }

}
