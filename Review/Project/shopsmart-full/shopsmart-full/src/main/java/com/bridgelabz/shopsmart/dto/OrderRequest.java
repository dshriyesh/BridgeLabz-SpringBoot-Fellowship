package com.bridgelabz.shopsmart.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class OrderRequest {

    @NotNull
    private Long customerId;

    @NotNull
    @Min(1)
    private Double totalAmount;
}