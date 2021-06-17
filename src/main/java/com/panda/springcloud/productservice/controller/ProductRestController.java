package com.panda.springcloud.productservice.controller;

import com.panda.springcloud.productservice.model.Product;
import com.panda.springcloud.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {
    @Autowired
    ProductRepository repository;


    //responsible creating the coupon and return that coupon back
    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product){
        return repository.save(product);
    }




}
