package com.example.basictms.controller;

import com.example.basictms.exception.OrderServiceException;
import com.example.basictms.request.OrderCreationRequest;
import com.example.basictms.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping (path = "/order/add")
    public ModelAndView getOrderForm(){
        return new ModelAndView("order-form.html");
    }

    @PostMapping("/order/add")
    public String createOrder(@RequestParam String startingPoint,
                              @RequestParam String destination,
                               @RequestParam LocalDate startDate,
                               @RequestParam LocalDate endDate,
                               Model model) {
        try {
            orderService.createOrder(new OrderCreationRequest(startingPoint, destination, startDate, endDate));
            model.addAttribute("message", "Dodano zlecenie: ");
        } catch (OrderServiceException e) {
            model.addAttribute("message", e.getMessage());
        }
        return "main-page";

    }
}
