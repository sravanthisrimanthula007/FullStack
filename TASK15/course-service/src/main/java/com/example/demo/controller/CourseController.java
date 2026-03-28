package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/course")
    public String getCourse() {
        return "Course Service Running";
    }
}