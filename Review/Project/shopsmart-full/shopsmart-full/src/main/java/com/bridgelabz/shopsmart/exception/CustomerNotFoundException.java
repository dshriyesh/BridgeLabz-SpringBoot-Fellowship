package com.bridgelabz.shopsmart.exception;

public class CustomerNotFoundException
        extends ShopSmartException {

    public CustomerNotFoundException(
            Long id){

        super(
                "Customer with id "
                        + id
                        + " not found",

                "CUSTOMER_NOT_FOUND"
        );
    }
}