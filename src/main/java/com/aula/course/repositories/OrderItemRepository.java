package com.aula.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
