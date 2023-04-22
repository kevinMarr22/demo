package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping
    public List<Product> listaProduct(){
        return productService.findAll();
    }
    @GetMapping(value="/{id}")
    public Product obtenerProduct(@PathVariable Long id){
        return productService.findById(id);
    }

    @PostMapping()
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }
    @PutMapping(value= "/{id}")
    public void modificarProducto(@RequestBody Product product,@PathVariable Long id){
        productService.modifyProduct(id, product);
    }
    @DeleteMapping(value = "/{id}")
    public void modificarProducto(@PathVariable Long id){
        productService.deleteProducto(id);
    }
}
