package com.example.basictms.service;

import com.example.basictms.entity.Order;
import com.example.basictms.entity.enums.OrderStatus;
import com.example.basictms.repository.OrderRepository;
import com.example.basictms.request.OrderCreationRequest;
import com.example.basictms.request.OrderFilterRequest;
import com.example.basictms.response.OrderResponse;
import jakarta.transaction.Transactional;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class OrderService {
    private OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public void createOrder(OrderCreationRequest request) {

        Order order = new Order(request.getStartingPoint(), request.getDestination(),request.getStartDate(),request.getEndDate(),request.getOrderStatus() ,request.getOfferedPrice());
        repository.save(order);
    }


    public List<OrderResponse> getAllOrders() {
        return repository.findAll().stream()
                .map(o -> new OrderResponse(o.getStartingPoint(), o.getDestination(), o.getStartDate(), o.getEndDate(), o.getOrderStatus(), o.getOfferedPrice()))
                .toList();
    }

    public List<OrderResponse> getOrder(OrderFilterRequest filterRequest) {
        OrderStatus orderStatus = OrderStatus.valueOf(filterRequest.getOrderStatus());
        return repository.findByOrderStatus(orderStatus).stream()
                .map(o -> new OrderResponse(o.getStartingPoint(), o.getDestination(), o.getStartDate(), o.getEndDate(), o.getOrderStatus(), o.getOfferedPrice()))
                .toList();
    }

}
