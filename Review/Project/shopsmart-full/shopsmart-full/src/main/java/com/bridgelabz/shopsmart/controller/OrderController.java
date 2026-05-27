package com.bridgelabz.shopsmart.controller;

import com.bridgelabz.shopsmart.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class OrderController {

    private final PaymentService service;

    public OrderController(
            PaymentService service){

        this.service=service;
    }

    @PostMapping("/{amount}")

    public String pay(
            @PathVariable Double amount){

        return service.makePayment(
                amount
        );
    }
}