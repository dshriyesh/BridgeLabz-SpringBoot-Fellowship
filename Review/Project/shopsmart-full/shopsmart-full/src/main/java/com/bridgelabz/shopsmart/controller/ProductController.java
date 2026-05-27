package com.bridgelabz.shopsmart.controller;

import com.bridgelabz.shopsmart.dto.ProductRequest;
import com.bridgelabz.shopsmart.dto.ProductResponse;
import com.bridgelabz.shopsmart.service.ProductService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/products")

public class ProductController {

    private final ProductService service;

    public ProductController(
            ProductService service){

        this.service=service;
    }


    @GetMapping
    public ResponseEntity<List<ProductResponse>>
    getAll(){

        return ResponseEntity.ok(
                service.getAllProducts()
        );
    }


    @GetMapping("/{id}")

    public ResponseEntity<ProductResponse>
    getById(
            @PathVariable Long id){

        return ResponseEntity.ok(
                service.getById(id)
        );
    }


    @PostMapping

    public ResponseEntity<ProductResponse>
    save(

            @Valid
            @RequestBody
            ProductRequest request){

        return ResponseEntity.status(
                201
        ).body(
                service.save(request)
        );
    }
}