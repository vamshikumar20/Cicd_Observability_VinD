package com.example.paymentgatewayservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentGatewayController {

    @GetMapping("/")
    public String index() {
        return "Payment Gateway Service is running";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

}
