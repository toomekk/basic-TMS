package com.example.basictms.rest;

import com.example.basictms.request.TruckRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TruckRestController {

    @PostMapping("api/v1/trucks/")
    public void addTrack(@RequestBody TruckRequest request) {
        System.out.println(request);
    }


}
