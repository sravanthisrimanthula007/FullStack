package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ConsumerService;

@RestController
@RequestMapping("/consume")
public class ConsumerController {

    @Autowired
    private ConsumerService service;

    @GetMapping("/message")
    public String getMessage() {
        return service.getMessage();
    }

    @GetMapping("/error")
    public String getError() {
        return service.getError();
    }
}
