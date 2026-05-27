package com.bridgelabz.shopsmart.exception;

public class PaymentFailedException
        extends ShopSmartException {

    public PaymentFailedException(){

        super(
                "Payment failed",

                "PAYMENT_FAILED"
        );
    }
}