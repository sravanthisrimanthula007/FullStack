package com.example.controller;

import com.example.model.User;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/register")
    public String registerUser(@Valid @RequestBody User user) {
        return "User registered successfully!";
    }
}