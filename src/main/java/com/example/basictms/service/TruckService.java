package com.example.basictms.service;

import com.example.basictms.entity.DrivingLicense;
import com.example.basictms.entity.Truck;
import com.example.basictms.repository.TruckRepository;
import com.example.basictms.request.DriverRequest;
import com.example.basictms.request.TruckRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

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
        if(truckRequest.getBrand().toString().isEmpty()) {
            throw new IllegalArgumentException("Wybierz markę ciężarówki!");
        }
        Truck truck = new Truck(truckRequest.getBrand(), truckRequest.getModel(), truckRequest.getTruckWeight(), truckRequest.getTruckMileage(),
                truckRequest.getLastReviewDate(), truckRequest.getReviewLimit(),
                DrivingLicense.valueOf(truckRequest.getLicense()));
        //dorzucić info o przeglądach
        String result = truckReview.doReview(truck);
        //zwrócić rezultat żeby controller zadbał o pokazanie komunikatu ostrzegawczego na stronie
        System.out.println(result);
        truckRepository.save(truck);
    }

    @Service
    public static class TruckReview {



        public String doReview(Truck truck) {
            System.out.println(truck);
            long remainingKilometers = truck.getReviewLimit() - truck.getTruckMileage();
            if (remainingKilometers > 0) {
               //checkReminder(truck.getTruckMileage(), truck.getReviewLimit(), truck.getLastReviewDate());
                return "Pozostało " + remainingKilometers + " km do przeglądu.";
            } else {
                LocalDate lastReviewDate = LocalDate.parse(truck.getLastReviewDate());
                LocalDate today = LocalDate.now();
                long daysLeft = today.toEpochDay() - lastReviewDate.toEpochDay();

                if (daysLeft >= 365) {

                  //  saveMileageToDB(reviewLimit, today.toString());
                    return "Przegląd jest już wymagany!";
                } else {
                   // checkReminder(truck.getTruckMileage(), truck.getReviewLimit(), truck.getLastReviewDate());
                    return "Przegląd nie jest jeszcze wymagany.";
                }
            }
        }


       /* private static void checkReminder(long truckMileage, long reviewLimit, String lastReviewDate) {
            LocalDate lastReviewDate = LocalDate.parse(lastReviewDate);
            LocalDate today = LocalDate.now();
            long daysLeft = today.toEpochDay() - lastReviewDate.toEpochDay();

            if (daysLeft >= 335 || truckMileage >= (reviewLimit - 1000)) {
                System.out.println("Przypomnienie: Przegląd jest bliski lub przekroczono 900 km do limitu.");
            }
        }*/
    }
}
