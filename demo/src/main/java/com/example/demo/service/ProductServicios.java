package com.example.demo.service;

import com.example.demo.entity.Product;

import java.util.List;

public interface ProductServicios {
    public List<Product> findAll();
    public Product findById(Long Id);
    public List<Product> findByName(String name);
    public void createproduct(Product product);
    public void modificarproduct(Long Id, Product product);
    public void deletproduct(Long Id );



}
