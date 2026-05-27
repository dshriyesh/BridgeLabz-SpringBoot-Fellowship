package com.bridgelabz.shopsmart.service;

import com.bridgelabz.shopsmart.entity.Customer;
import com.bridgelabz.shopsmart.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(
            CustomerRepository repository){

        this.repository = repository;
    }

    public Customer save(
            Customer customer){

        if(repository.existsByEmail(
                customer.getEmail())){

            throw new RuntimeException(
                    "Email already exists"
            );
        }

        return repository.save(
                customer
        );
    }
}