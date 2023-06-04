package com.example.basictms.controller;

import com.example.basictms.entity.Driver;
import com.example.basictms.request.DriverRequest;
import com.example.basictms.service.DriverService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DriverController {
    private DriverService driverService;
    public DriverController(DriverService driverService){this.driverService = driverService;}


    @GetMapping ("/driver/add")
    public String getPage(){return "add-driver";}

    @PostMapping("/driver/add")
    public String addDriver(@Valid DriverRequest driverRequest, BindingResult bindingResult, Model model) {
        System.out.println(driverRequest);
        System.out.println(bindingResult.getModel());
        if(bindingResult.hasErrors()){
            model.addAttribute("error", bindingResult.getFieldError().getDefaultMessage());
            return "add-driver";
        }
        try{
            driverService.addDriver(driverRequest);
        }catch (IllegalArgumentException e){
            model.addAttribute("error", e.getMessage());
            return "error-page";
        }
        return "main-page";
    }

}
