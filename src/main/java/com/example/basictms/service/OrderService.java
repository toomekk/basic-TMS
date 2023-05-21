package com.example.basictms.service;

import com.example.basictms.entity.Order;
import com.example.basictms.repository.OrderRepository;
import com.example.basictms.request.OrderCreationRequest;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderService {
    private OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public void createOrder(OrderCreationRequest request) {

        Order order = new Order(request.getStartingPoint(), request.getDestination(),request.getStartDate(),request.getEndDate(), request.getOfferedPrice());
        repository.save(order);
    }
}
