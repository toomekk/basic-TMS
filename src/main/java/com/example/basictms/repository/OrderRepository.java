package com.example.basictms.repository;

import com.example.basictms.entity.Order;
import com.example.basictms.entity.enums.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
List<Order> findByOrderStatus(OrderStatus orderStatus);

}
