package com.codewithsouma.springbootcurd.controller;

import com.codewithsouma.springbootcurd.entity.Product;
import com.codewithsouma.springbootcurd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/api/product")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/api/products")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }

    @GetMapping("/api/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/api/product/id/{id}")
    public Product getProductById(@PathVariable(value = "id") int id){
        return service.getProductById(id);
    }

    @GetMapping("/api/product/name/{name}")
    public Product getProductByName(@PathVariable(value = "name") String name){
        return service.getProductByName(name);
    }

    @PutMapping("/api/product")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/api/product/{id}")
    public String deleteProduct(@PathVariable(value = "id") int id){
        return service.deleteById(id);
    }

}
