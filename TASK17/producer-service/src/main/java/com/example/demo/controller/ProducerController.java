package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class ProducerController {

    @GetMapping("/message")
    public String getMessage() {
        return "Hello from Producer Microservice!";
    }

    @GetMapping("/error")
    public String getError() {
        throw new RuntimeException("Simulated error!");
    }
}