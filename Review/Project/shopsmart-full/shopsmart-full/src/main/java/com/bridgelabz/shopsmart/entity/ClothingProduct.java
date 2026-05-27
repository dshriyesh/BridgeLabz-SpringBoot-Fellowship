package com.bridgelabz.shopsmart.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

@DiscriminatorValue("CLOTHING")

public class ClothingProduct
        extends Product {

    private String size;

    private String color;

    @Override
    public Double calculateFinalPrice(){

        return getBasePrice();
    }
}