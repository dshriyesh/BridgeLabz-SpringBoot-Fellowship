package com.bridgelabz.shopsmart.exception;

public class ProductNotFoundException
        extends ShopSmartException {

    public ProductNotFoundException(
            Long id){

        super(
                "Product with id "
                        + id
                        + " not found",

                "PRODUCT_NOT_FOUND"
        );
    }
}