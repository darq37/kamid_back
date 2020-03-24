package com.kamid.kamid_back.controller;

import com.kamid.kamid_back.domain.Product;
import com.kamid.kamid_back.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {


    @Autowired
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productRepository.findAll();
    }


    @PostMapping
    public void addProduct(@RequestBody Product product) {
        this.productRepository.save(product);
    }

}
