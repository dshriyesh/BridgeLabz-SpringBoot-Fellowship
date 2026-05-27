package com.bridgelabz.shopsmart.dto;

import com.bridgelabz.shopsmart.entity.OrderStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class OrderResponse {

    private Long id;

    private String customerName;

    private Double totalAmount;

    private OrderStatus status;
}