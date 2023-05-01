package com.example.demo.dao;

import com.example.demo.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Productdao extends CrudRepository<Product, Long> {
    List<Product> findByName(String name);

}
