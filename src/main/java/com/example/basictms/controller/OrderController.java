package com.example.basictms.controller;

import com.example.basictms.entity.Order;
import com.example.basictms.entity.enums.OrderStatus;
import com.example.basictms.exception.OrderServiceException;
import com.example.basictms.request.OrderCompleteRequest;
import com.example.basictms.request.OrderCreationRequest;
import com.example.basictms.request.OrderFilterRequest;
import com.example.basictms.response.OrderResponse;
import com.example.basictms.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;

@Controller
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/order/add")
    public ModelAndView getOrderForm() {
        return new ModelAndView("order-form.html");
    }

    @PostMapping("/order/add")
    public String createOrder(@Valid @RequestParam String startingPoint,
                              @RequestParam String destination,
                              @RequestParam LocalDate startDate,
                              @RequestParam LocalDate endDate,
                              @RequestParam OrderStatus orderStatus,
                              @RequestParam double offeredPrice,
                              Model model) {
        try {
            orderService.createOrder(new OrderCreationRequest(startingPoint, destination, startDate, endDate, orderStatus, offeredPrice));
            model.addAttribute("message", "Dodano zlecenie: ");
        } catch (OrderServiceException e) {
            model.addAttribute("message", e.getMessage());
        }
        return "main-page";

    }


    @GetMapping("/order/find")
    public String getFindOrderPage(Model model) {
        model.addAttribute("request", new OrderFilterRequest());
        List<OrderResponse> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "find-order";
    }

    @PostMapping("/order/find")
    public String filteredFindOrderPage(
            @ModelAttribute("request") OrderFilterRequest request,
            Model model) {
        List<OrderResponse> orders = orderService.getOrder(request);
        model.addAttribute("orders", orders);
        System.out.println(request);
        return "find-order";
    }

    @GetMapping("/complete-order")
    public String getCompleteOrderPage() {
        return "complete-order";
    }

    @PostMapping("/complete-order")
    public String completeOrder(OrderCompleteRequest orderCompleteRequest) {
        System.out.println(orderCompleteRequest);
        orderService.completeOrder(orderCompleteRequest);
        return "main-page";
    }

}
