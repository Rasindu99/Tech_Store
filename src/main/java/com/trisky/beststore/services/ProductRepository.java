package com.trisky.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trisky.beststore.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
