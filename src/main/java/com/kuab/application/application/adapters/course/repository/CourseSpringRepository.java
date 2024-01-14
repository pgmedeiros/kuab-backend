package com.kuab.application.application.adapters.out;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface CourseSpringRepository extends CrudRepository<CourseEntity, UUID> {
}
