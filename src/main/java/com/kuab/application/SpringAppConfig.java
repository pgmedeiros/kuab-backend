package com.kuab.application;

import com.kuab.application.application.adapters.course.repository.JpaCourseRepository;
import com.kuab.application.domain.course.ports.in.CoursePort;
import com.kuab.application.domain.course.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAppConfig {

    @Autowired
    JpaCourseRepository repository;


    @Bean
    CoursePort coursePort() {
        return new CourseService(repository);
    }

}
