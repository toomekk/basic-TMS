package com.example.basictms.service;

import com.example.basictms.TruckReview;
import com.example.basictms.entity.DrivingLicense;
import com.example.basictms.entity.Truck;
import com.example.basictms.repository.TruckRepository;
import com.example.basictms.request.DriverRequest;
import com.example.basictms.request.TruckRequest;
import org.springframework.stereotype.Service;

@Service
public class TruckService {
    private TruckRepository truckRepository;
    private TruckReview truckReview;

    public TruckService(TruckRepository truckRepository, TruckReview truckReview) {
        this.truckRepository = truckRepository;
        this.truckReview = truckReview;
    }

    public void addTruck(TruckRequest truckRequest) {
        DriverRequest driverRequest;

        Truck truck = new Truck(truckRequest.getBrand(), truckRequest.getModel(), truckRequest.getTruckWeight(), truckRequest.getTruckMileage(),
                truckRequest.getLastReviewDate(), truckRequest.getReviewLimit(),
                DrivingLicense.valueOf(truckRequest.getLicense()));
        //dorzucić info o przeglądach
        String result = truckReview.doReview(truck);
        //zwrócić rezultat żeby controller zadbał o pokazanie komunikatu ostrzegawczego na stronie
        System.out.println(result);
        truckRepository.save(truck);
    }
}
