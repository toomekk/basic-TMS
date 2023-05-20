package com.example.basictms.controller;

import com.example.basictms.repository.TrailerRepository;
import com.example.basictms.request.TrailerRequest;
import com.example.basictms.service.TrailerService;
import com.example.basictms.service.TruckService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrailerController {
    private TrailerService trailerService;
    public TrailerController(TrailerService trailerService){
        this.trailerService = trailerService;
    }
    @GetMapping("/trailer/add")
    public String getPage(){
        return "add-trailer";
    }
    @PostMapping("/trailer/add")
    public String addTrailer(TrailerRequest trailerRequest){
        System.out.println(trailerRequest);
        trailerService.addTrailer(trailerRequest);
        return "main-page";
    }


}

