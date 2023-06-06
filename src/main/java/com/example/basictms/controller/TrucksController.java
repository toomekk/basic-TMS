package com.example.basictms.controller;

import com.example.basictms.request.DriverRequest;
import com.example.basictms.request.TruckRequest;
import com.example.basictms.service.DriverService;
import com.example.basictms.service.TruckService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrucksController {
    private TruckService truckService;

    public TrucksController(TruckService truckService) {
        this.truckService = truckService;
    }


    @GetMapping("/truck/add")
    public String getPage(Model model) {
        TruckRequest truckRequest = new TruckRequest();
        model.addAttribute("truck", truckRequest);
        return "add-truck";
    }

    @PostMapping("/truck/add")
    public String addTruck(@ModelAttribute(name="truck") @Valid TruckRequest truckRequest, BindingResult bindingResult, Model model) {
//        System.out.println(truckRequest);
        if (bindingResult.hasErrors()) {
            model.addAttribute("error", bindingResult.getFieldError().getDefaultMessage());
            return "add-truck";
        }
        try {
            truckService.addTruck(truckRequest);
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "error-page";
        }
        return "main-page";
    }
}
