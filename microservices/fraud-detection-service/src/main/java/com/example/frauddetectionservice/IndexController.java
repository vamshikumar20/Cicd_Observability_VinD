package com.example.frauddetectionservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Fraud Detection Service is running";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

}
