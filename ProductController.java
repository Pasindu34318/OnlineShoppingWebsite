package com.example.onlineshopping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 800.00, "https://via.placeholder.com/100"));
        products.add(new Product(2, "Smartphone", 500.00, "https://via.placeholder.com/100"));
        products.add(new Product(3, "Headphones", 50.00, "https://via.placeholder.com/100"));
        products.add(new Product(4, "Keyboard", 30.00, "https://via.placeholder.com/100"));
        products.add(new Product(5, "Mouse", 20.00, "https://via.placeholder.com/100"));
        return products;
    }
}
