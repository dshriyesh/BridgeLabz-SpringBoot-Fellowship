package com.bridgelabz.shopsmart.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor

@Inheritance(
        strategy = InheritanceType.SINGLE_TABLE
)

@DiscriminatorColumn(
        name = "product_type"
)

public abstract class Product {

    @Id
    @GeneratedValue(
            strategy =
                    GenerationType.IDENTITY
    )
    private Long id;

    private String name;

    private Double basePrice;

    private String category;

    private Integer stockQuantity;

    public abstract Double calculateFinalPrice();
}