package com.example.crudMavan.service;

import com.example.crudMavan.entity.Product;
import com.example.crudMavan.repository.ProductRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> saveProducts(List<Product> product) {
        return productRepository.saveAll(product);
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);

    }

    public List<Product> getProduct() {
        return productRepository.findAll();

    }
    public List<Product> getProducts() {
        return productRepository.findAll();

    }
    public Product getProductByName(String name){
        return productRepository.findByName(name);
    }
   public Product updateProduct( Product product){
       Product existingProduct=productRepository.findById(product.getId()).orElse(null);
       existingProduct.setName(product.getName());
       existingProduct.setQuantity(product.getQuantity());
       existingProduct.setPrice(product.getPrice());
       return productRepository.save(existingProduct);
   }
   public String deleteProduct(int id){
        productRepository.deleteById(id);
    return "product removed || "+id;}}
