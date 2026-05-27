package com.bridgelabz.shopsmart.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProductRequest {

    @NotBlank
    private String name;

    @NotNull
    @Min(1)
    private Double basePrice;

    @NotBlank
    private String category;

    @NotNull
    @Min(0)
    private Integer stockQuantity;
}