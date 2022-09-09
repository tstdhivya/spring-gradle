package com.example.crudMavan.controller;

import com.example.crudMavan.entity.Product;
import com.example.crudMavan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/entity")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PostMapping("/entityPost")
    public List<Product> saveProducts(@RequestBody List<Product> product) {
        return productService.saveProducts(product);
    }

    @GetMapping("/entity/{id}")
    public Product findProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }


    @GetMapping("/entityGet")
    public List<Product> getProduct() {
        return productService.getProduct();
    }


    @GetMapping("/entityGets")
    public List<Product> getProducts() {
        return productService.getProducts();
    }
    @GetMapping("/entityName/{name}")
    public Product findProductByName(@PathVariable String name){
        return productService.getProductByName(name);

}
@PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
}
@DeleteMapping("/delete")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
}
}


//    public Product getProductName(String name){
//        return productRepository.getProductByName(name);
//    }


