package com.example.controller;

import com.example.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable int id) {
        if (id != 1) {
            throw new ResourceNotFoundException("User with ID " + id + " not found");
        }
        return "User Found: ID = " + id;
    }
}