package com.example.basictms.controller;

import com.example.basictms.entity.Driver;
import com.example.basictms.request.DriverRequest;
import com.example.basictms.service.DriverService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DriverController {
    private DriverService driverService;
    public DriverController(DriverService driverService){this.driverService = driverService;}


    @GetMapping ("/driver/add")
    public String getPage(){return "add-driver";}

    @PostMapping("/driver/add")
    public String addDriver(DriverRequest driverRequest) {
        System.out.println(driverRequest);
        driverService.addDriver(driverRequest);
        return "main-page";
    }

}
