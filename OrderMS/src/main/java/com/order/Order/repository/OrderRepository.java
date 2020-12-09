package com.order.Order.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.order.Order.entity.Order;



public interface OrderRepository extends JpaRepository<Order, Integer>{

}

