package com.example.demo.service;

import com.example.demo.dao.Productdao;
import com.example.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductServicios {
    @Autowired
    private Productdao productdao;
    @Override
    public List<Product> findAll() {
        return (List<Product>)productdao.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productdao.findById(id).orElse(null);
    }

    @Override
    public List<Product> findByName(String name) {
        return productdao.findByName(name);
    }


    @Override
    public void createproduct(Product product) {
        productdao.save(product);
    }

    @Override
    public void modificarproduct(Long id, Product product) {
        if(productdao.existsById(id)) {
            product.setId(id);
            productdao.save(product);
        }
    }

    @Override
    public void deletproduct(Long id) {
        if(productdao.existsById(id)) {
            productdao.deleteById(id);
        }
    }
}
