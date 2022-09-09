package com.example.crudMavan.repository;

import com.example.crudMavan.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);

}