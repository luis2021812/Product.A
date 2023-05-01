package com.example.demo.controler;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductControler {
    @Autowired
    ProductServicios productServicios;
    @GetMapping
    public List<Product> listProduct(){
        return productServicios.findAll();
    }
    @GetMapping(value = "/{id}")
    public  Product obtenerProduct(@RequestParam Long id) {
        return productServicios.findById(id);
    }
    @PostMapping()
    public void createProduct(@RequestBody Product product) {
        productServicios.createproduct(product);
    }
    @GetMapping(value = "/{name}")
    public List<Product> nameProduct(@RequestParam String name) {
        return productServicios.findByName(name);
    }
    @PutMapping(value = "/{id}")
    public void modifyProduct(@PathVariable Long id, @RequestBody Product product) {
        productServicios.modificarproduct(id, product);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productServicios.deletproduct(id);
    }
}
