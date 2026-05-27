package com.bridgelabz.shopsmart.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class UPIPayment
        implements PaymentMethod {

    @Override
    public double processPayment(
            double amount){

        return amount;
    }
}