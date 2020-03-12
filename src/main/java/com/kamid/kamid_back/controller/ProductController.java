package com.kamid.kamid_back.controller;

import com.kamid.kamid_back.domain.Product;
import com.kamid.kamid_back.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/products")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping
    public String getProducts(){
        return productRepository.findAll().toString();
    }
    @GetMapping
    public String getProduct(Long id){
        return productRepository.findById(id).toString();
    }
    @PostMapping
    public void makeProduct(Product product){
        this.productRepository.save(product);
    }
}
