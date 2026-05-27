package com.bridgelabz.shopsmart.service;

import org.springframework.stereotype.Service;

@Service
public class ExternalPaymentGateway {

    public String processPayment(
            Double amount){

        //dummy validation

        if(amount>50000){

            return "FAILED";
        }

        return "PAYMENT_SUCCESS";
    }
}