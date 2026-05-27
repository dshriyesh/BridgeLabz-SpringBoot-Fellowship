package com.bridgelabz.shopsmart.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;


    @ManyToOne
    @JoinColumn(
            name="customer_id"
    )
    private Customer customer;


    private Double totalAmount;


    @Enumerated(
            EnumType.STRING
    )
    private OrderStatus status;

}