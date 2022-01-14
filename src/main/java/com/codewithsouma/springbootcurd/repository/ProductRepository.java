package com.codewithsouma.springbootcurd.repository;

import com.codewithsouma.springbootcurd.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
