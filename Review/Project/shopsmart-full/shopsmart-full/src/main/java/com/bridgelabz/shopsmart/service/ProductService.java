package com.bridgelabz.shopsmart.service;

import com.bridgelabz.shopsmart.dto.ProductRequest;
import com.bridgelabz.shopsmart.dto.ProductResponse;
import com.bridgelabz.shopsmart.entity.ElectronicsProduct;
import com.bridgelabz.shopsmart.entity.Product;
import com.bridgelabz.shopsmart.exception.ProductNotFoundException;
import com.bridgelabz.shopsmart.repository.ProductRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(
            ProductRepository repository){

        this.repository=repository;
    }


    //Get all products
    public List<ProductResponse>
    getAllProducts(){

        return repository.findAll()

                .stream()

                .map(product ->
                        new ProductResponse(

                                product.getId(),
                                product.getName(),
                                product.calculateFinalPrice(),
                                product.getCategory(),
                                product.getStockQuantity()
                        )
                )

                .collect(Collectors.toList());
    }


    //Save Product
    public ProductResponse
    save(ProductRequest request){

        ElectronicsProduct product =
                new ElectronicsProduct();

        product.setName(
                request.getName());

        product.setBasePrice(
                request.getBasePrice());

        product.setCategory(
                request.getCategory());

        product.setStockQuantity(
                request.getStockQuantity());



        Product saved =
                repository.save(product);

        return new ProductResponse(

                saved.getId(),
                saved.getName(),
                saved.calculateFinalPrice(),
                saved.getCategory(),
                saved.getStockQuantity()
        );
    }


    //Get by id
    public ProductResponse
    getById(Long id){

        Product product =

                repository.findById(id)

                        .orElseThrow(
                                () ->
                                        new ProductNotFoundException(
                                                id
                                        )
                        );

        return new ProductResponse(

                product.getId(),
                product.getName(),
                product.calculateFinalPrice(),
                product.getCategory(),
                product.getStockQuantity()
        );
    }

}