package com.kuab.application.application.adapters.course.repository;

import com.kuab.application.application.adapters.common.toEntity;
import com.kuab.application.domain.course.model.Course;
import com.kuab.application.domain.course.ports.out.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaCourseRepository implements CourseRepository {


    @Autowired CourseSpringRepository springRepository;
    @Override
    public List<Course> find() {
        return springRepository
                .findAll()
                .stream()
                .map(toEntity::convert)
                .toList();
    }
}
