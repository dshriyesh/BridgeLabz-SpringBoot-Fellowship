package com.bridgelabz.shopsmart.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

@DiscriminatorValue(
        "ELECTRONICS"
)

public class ElectronicsProduct
        extends Product {

    private Integer warrantyMonths;

    @Override
    public Double calculateFinalPrice(){

        return getBasePrice()*1.10;
    }
}