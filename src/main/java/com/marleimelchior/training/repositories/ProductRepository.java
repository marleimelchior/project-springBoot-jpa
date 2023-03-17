package com.marleimelchior.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marleimelchior.training.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
