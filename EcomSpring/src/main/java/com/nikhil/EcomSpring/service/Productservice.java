package com.nikhil.EcomSpring.service;

import com.nikhil.EcomSpring.modal.Product;
import com.nikhil.EcomSpring.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Productservice {
    @Autowired
    ProductRepo repo;
    public List<Product> getAllProduct() {
        return repo.findAll();

    }

    public Product getProduct(int id) {
        return repo.findById(id).orElse(null);

    }
}
