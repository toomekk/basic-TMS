package com.example.basictms.service;

import com.example.basictms.entity.Driver;
import com.example.basictms.entity.DrivingLicense;
import com.example.basictms.entity.Truck;
import com.example.basictms.repository.DriverRepository;
import com.example.basictms.repository.TruckRepository;
import com.example.basictms.request.DriverRequest;
import com.example.basictms.request.TruckRequest;
import org.springframework.stereotype.Service;

@Service
public class TruckService {
    private TruckRepository truckRepository;

    public TruckService(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }

    public void addTruck(TruckRequest truckRequest) {


        DriverRequest driverRequest;

        Truck truck = new Truck(truckRequest.getBrand(), truckRequest.getModel(), truckRequest.getTruckWeight(),
                DrivingLicense.valueOf(truckRequest.getLicense()));
        truckRepository.save(truck);
    }
}
