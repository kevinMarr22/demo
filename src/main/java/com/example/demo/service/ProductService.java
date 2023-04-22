package com.example.demo.service;

import com.example.demo.entity.Product;
import java.util.List;

public interface ProductService {
    public List<Product> findAll();
    public Product findById(Long id);
    public void createProduct(Product product);
    public void modifyProduct(Long id, Product product);
    public void deleteProducto(Long id);
}
