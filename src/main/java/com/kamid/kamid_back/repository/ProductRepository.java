package com.kamid.kamid_back.repository;

import com.kamid.kamid_back.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
