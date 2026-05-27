package com.bridgelabz.shopsmart.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CustomerRequest {

    @NotBlank
    private String name;

    @Email
    private String email;

    @Pattern(
            regexp="\\d{10}"
    )
    private String phone;

    private String address;
}