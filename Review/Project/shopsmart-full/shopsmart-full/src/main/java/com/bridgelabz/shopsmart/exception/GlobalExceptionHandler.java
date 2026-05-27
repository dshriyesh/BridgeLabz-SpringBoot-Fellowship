package com.bridgelabz.shopsmart.exception;

import com.bridgelabz.shopsmart.dto.ErrorResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestControllerAdvice

public class GlobalExceptionHandler {


    @ExceptionHandler(
            ProductNotFoundException.class
    )

    public ResponseEntity<ErrorResponse>
    handleProductException(
            ProductNotFoundException ex){

        ErrorResponse response =
                new ErrorResponse(

                        ex.getErrorCode(),

                        ex.getMessage(),

                        ex.getTimestamp()
                );

        return new ResponseEntity<>(
                response,
                HttpStatus.NOT_FOUND
        );
    }



    @ExceptionHandler(
            CustomerNotFoundException.class
    )

    public ResponseEntity<ErrorResponse>
    handleCustomerException(
            CustomerNotFoundException ex){

        ErrorResponse response =
                new ErrorResponse(

                        ex.getErrorCode(),

                        ex.getMessage(),

                        ex.getTimestamp()
                );

        return new ResponseEntity<>(

                response,

                HttpStatus.NOT_FOUND
        );
    }



    @ExceptionHandler(
            InvalidOrderException.class
    )

    public ResponseEntity<ErrorResponse>
    handleOrderException(
            InvalidOrderException ex){

        ErrorResponse response =
                new ErrorResponse(

                        ex.getErrorCode(),

                        ex.getMessage(),

                        ex.getTimestamp()
                );

        return new ResponseEntity<>(

                response,

                HttpStatus.BAD_REQUEST
        );
    }



    @ExceptionHandler(
            Exception.class
    )

    public ResponseEntity<ErrorResponse>
    handleGeneric(
            Exception ex){

        ErrorResponse response =
                new ErrorResponse(

                        "INTERNAL_ERROR",

                        ex.getMessage(),

                        java.time.LocalDateTime.now()
                );

        return new ResponseEntity<>(

                response,

                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}