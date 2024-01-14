package com.kuab.application.application.adapters.course.repository;

import com.kuab.application.application.adapters.course.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface CourseSpringRepository extends JpaRepository<CourseEntity, UUID> {
}
