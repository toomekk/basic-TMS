package com.example.basictms.controller;

import com.example.basictms.request.DriverRequest;
import com.example.basictms.request.TruckRequest;
import com.example.basictms.service.DriverService;
import com.example.basictms.service.TruckService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrucksController {
    private TruckService truckService;
    public TrucksController(TruckService truckService){
        this.truckService = truckService;
    }


    @GetMapping ("/truck/add")
    public String getPage(){return "add-truck";}

    @PostMapping("/truck/add")
    public String addTruck(@Valid TruckRequest truckRequest) {
        System.out.println(truckRequest);
        truckService.addTruck(truckRequest);
        return "main-page";
    }
}
