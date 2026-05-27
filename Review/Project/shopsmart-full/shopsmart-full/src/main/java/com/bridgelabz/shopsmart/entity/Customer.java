package com.bridgelabz.shopsmart.entity;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import lombok.*;
@Entity @Getter @Setter
public class Customer{
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
@Email private String email;
@Pattern(regexp="\\d{10}") private String phone;
private String address;
}