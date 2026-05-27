package com.bridgelabz.shopsmart.payment;

import org.springframework.stereotype.Component;

@Component
public class CashOnDelivery
        implements PaymentMethod {

    @Override
    public double processPayment(
            double amount){

        return amount +
                amount*0.05;
    }
}