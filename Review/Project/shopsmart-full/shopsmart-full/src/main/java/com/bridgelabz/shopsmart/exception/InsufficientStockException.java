package com.bridgelabz.shopsmart.exception;

public class InsufficientStockException
        extends ShopSmartException {

    public InsufficientStockException(
            String productName){

        super(
                "Insufficient stock for "
                        + productName,

                "INSUFFICIENT_STOCK"
        );
    }
}