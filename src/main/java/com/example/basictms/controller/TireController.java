package com.example.basictms.controller;

import com.example.basictms.request.TireRequest;
import com.example.basictms.service.TireService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TireController {
    private TireService tireService;

    public TireController(TireService tireService) {
        this.tireService = tireService;
    }
    @GetMapping("/tire/add")
    public String getPage(){
        return "add-tire";
    }
    @PostMapping("/tire/add")
    public String addTire(TireRequest tireRequest){
        System.out.println(tireRequest);
        tireService.addTire(tireRequest);
        return "main-page";
    }
}
