package com.kuab.application.application.adapters.in;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {


    @GetMapping("/")
    public String getCourses() {
        return "Olá";
    }


}
