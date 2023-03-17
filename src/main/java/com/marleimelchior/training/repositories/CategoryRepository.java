package com.marleimelchior.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marleimelchior.training.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
