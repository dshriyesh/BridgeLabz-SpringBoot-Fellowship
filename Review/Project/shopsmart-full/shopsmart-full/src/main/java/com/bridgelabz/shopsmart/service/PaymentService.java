package com.bridgelabz.shopsmart.service;

import com.bridgelabz.shopsmart.exception.PaymentFailedException;
import com.bridgelabz.shopsmart.payment.PaymentMethod;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentMethod paymentMethod;

    public PaymentService(

            @Qualifier("creditCardPayment")
            PaymentMethod paymentMethod){

        this.paymentMethod = paymentMethod;
    }


    public String makePayment(
            Double amount){

        double finalAmount =
                paymentMethod.processPayment(
                        amount
                );

        if(finalAmount<=0){

            throw new PaymentFailedException();
        }

        return "Payment Successful : "
                + finalAmount;
    }

}