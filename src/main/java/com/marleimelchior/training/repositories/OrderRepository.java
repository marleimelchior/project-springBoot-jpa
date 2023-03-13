package com.marleimelchior.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marleimelchior.training.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
