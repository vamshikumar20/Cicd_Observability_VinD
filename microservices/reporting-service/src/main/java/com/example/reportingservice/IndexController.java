package com.example.reportingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Reporting Service is running";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

}
