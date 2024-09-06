package com.ead2.lapstore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ead2.lapstore.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
