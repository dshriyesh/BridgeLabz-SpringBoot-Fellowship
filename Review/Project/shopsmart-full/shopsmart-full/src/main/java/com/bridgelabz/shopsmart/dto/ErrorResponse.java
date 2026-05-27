package com.bridgelabz.shopsmart.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ErrorResponse {

    private String errorCode;

    private String message;

    private LocalDateTime timestamp;
}