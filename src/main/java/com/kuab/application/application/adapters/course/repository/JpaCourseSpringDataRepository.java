package com.kuab.application.application.adapters.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface JpaCourseSpringDataRepository extends JpaRepository<CourseJpaTable, UUID> {
}
