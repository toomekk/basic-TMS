package com.example.basictms.service;

import com.example.basictms.entity.Driver;
import com.example.basictms.entity.Order;
import com.example.basictms.entity.Truck;
import com.example.basictms.entity.enums.OrderStatus;
import com.example.basictms.repository.DriverRepository;
import com.example.basictms.repository.OrderRepository;
import com.example.basictms.repository.TruckRepository;
import com.example.basictms.request.OrderCompleteRequest;
import com.example.basictms.request.OrderCreationRequest;
import com.example.basictms.request.OrderFilterRequest;
import com.example.basictms.response.OrderResponse;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class OrderService {
    private OrderRepository orderRepository;
    private DriverRepository driverRepository;
    private TruckRepository truckRepository;

    public OrderService(OrderRepository orderRepository, DriverRepository driverRepository, TruckRepository truckRepository) {
        this.orderRepository = orderRepository;
        this.driverRepository = driverRepository;
        this.truckRepository = truckRepository;
    }

    public void createOrder(OrderCreationRequest request) {

        Order order = new Order(request.getStartingPoint(), request.getDestination(),request.getStartDate(),request.getEndDate(),
                request.getOrderStatus() ,request.getOfferedPrice());
        orderRepository.save(order);
    }



    public List<OrderResponse> getAllOrders() {
        return orderRepository.findAll().stream()
                .map(o -> new OrderResponse(o.getStartingPoint(), o.getDestination(), o.getStartDate(), o.getEndDate(), o.getOrderStatus(), o.getOfferedPrice()))
                .toList();
    }

    public List<OrderResponse> getOrder(OrderFilterRequest filterRequest) {
        OrderStatus orderStatus = OrderStatus.valueOf(filterRequest.getOrderStatus());
        return orderRepository.findByOrderStatus(orderStatus).stream()
                .map(o -> new OrderResponse(o.getStartingPoint(), o.getDestination(), o.getStartDate(), o.getEndDate(), o.getOrderStatus(), o.getOfferedPrice()))
                .toList();
    }

    public void completeOrder(OrderCompleteRequest completeRequest){
        Order order = orderRepository.findById(completeRequest.getOrderId()).orElseThrow();
        Driver driver = driverRepository.findById(completeRequest.getDriverId()).orElseThrow();
        Truck truck = truckRepository.findById(completeRequest.getTruckId()).orElseThrow();
        order.setDriver(driver);
        order.setTruck(truck);
        orderRepository.save(order);
    }

}
