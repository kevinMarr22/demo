package com.example.demo.service;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceimpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public List<Product> findAll() {
        return (List<Product>)productDao.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productDao.findById(id).orElse(null);
    }

    @Override
    public void createProduct(Product product) {
        productDao.save(product);
    }

    @Override
    public void modifyProduct(Long id, Product product) {
    if(productDao.existsById(id)){
        product.setId(id);
        productDao.save(product);
    }
    }

    @Override
    public void deleteProducto(Long id) {
    if(productDao.existsById(id)){
        productDao.existsById(id);
    }
    }
}
