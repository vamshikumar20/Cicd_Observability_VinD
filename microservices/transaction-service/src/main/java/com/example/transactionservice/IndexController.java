package com.example.transactionservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Transaction Service is running";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

}
