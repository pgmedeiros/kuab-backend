package com.kuab.application.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {


    @GetMapping("/")
    public String getCourses() {
        return "Olá";
    }


}
