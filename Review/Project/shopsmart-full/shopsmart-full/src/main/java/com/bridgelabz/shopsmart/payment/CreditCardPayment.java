package com.bridgelabz.shopsmart.payment;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment
        implements PaymentMethod {

    @Override
    public double processPayment(
            double amount){

        return amount +
                amount*0.02;
    }
}