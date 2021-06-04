package com.sathish.productservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.productservices.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
