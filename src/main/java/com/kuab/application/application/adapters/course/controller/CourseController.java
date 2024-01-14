package com.kuab.application.application.adapters.in;

import com.kuab.application.domain.course.model.Course;
import com.kuab.application.domain.course.ports.in.CoursePort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class CourseController {

    private final CoursePort coursePort;

    public CourseController(CoursePort coursePort) {
        this.coursePort = coursePort;
    }

    @GetMapping("/")
    public List<Course> getCourses(UUID id) {
       return coursePort.getCourses(id);
    }


}
