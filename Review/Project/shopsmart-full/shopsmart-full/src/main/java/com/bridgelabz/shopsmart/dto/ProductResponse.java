package com.bridgelabz.shopsmart.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProductResponse {

    private Long id;

    private String name;

    private Double price;

    private String category;

    private Integer stockQuantity;
}