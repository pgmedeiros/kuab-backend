package com.kuab.application.application.adapters.out;

import com.kuab.application.application.adapters.toEntity;
import com.kuab.application.domain.course.model.Course;
import com.kuab.application.domain.course.ports.out.CourseDatabasePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class JpaCourseRepository implements CourseDatabasePort {


    @Autowired CourseSpringRepository springRepository;
    @Override
    public List<Course> find(UUID id) {
        return springRepository.findById(id).map(toEntity::convert).stream().toList();
    }
}
