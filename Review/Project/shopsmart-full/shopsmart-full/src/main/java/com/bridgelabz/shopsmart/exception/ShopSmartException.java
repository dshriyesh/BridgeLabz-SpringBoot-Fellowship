package com.bridgelabz.shopsmart.exception;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ShopSmartException
        extends RuntimeException {

    private String errorCode;

    private LocalDateTime timestamp;

    public ShopSmartException(
            String message,
            String errorCode) {

        super(message);

        this.errorCode = errorCode;

        this.timestamp =
                LocalDateTime.now();
    }
}