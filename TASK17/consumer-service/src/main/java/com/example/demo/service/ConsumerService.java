package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    private final String URL = "http://localhost:8080/api/message";

    public String getMessage() {
        try {
            return restTemplate.getForObject(URL, String.class);
        } catch (Exception e) {
            return "Fallback: Producer is down!";
        }
    }

    public String getError() {
        try {
            return restTemplate.getForObject("http://localhost:8080/api/error", String.class);
        } catch (Exception e) {
            return "Handled Error: " + e.getMessage();
        }
    }
}
