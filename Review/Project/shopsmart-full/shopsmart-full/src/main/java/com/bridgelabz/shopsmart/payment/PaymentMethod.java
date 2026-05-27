package com.bridgelabz.shopsmart.payment;

public interface PaymentMethod {

    double processPayment(
            double amount
    );
}