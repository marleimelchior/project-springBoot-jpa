package com.marleimelchior.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marleimelchior.training.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
