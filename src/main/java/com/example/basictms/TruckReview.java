package com.example.basictms;
import com.example.basictms.entity.Truck;
import org.springframework.stereotype.Service;
import java.sql.*;
import java.time.LocalDate;
@Service
public class TruckReview {



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

       /* private static void saveMileageToDB(long truckMileage, String reviewDate) {
            ;

            try {
                Connection connection = DriverManager.getConnection();
                Statement statement = connection.createStatement();
                String sql = "INSERT INTO przebiegi (stan_licznika, data_przebiegu) VALUES (" +
                        truckMileage + ", '" + data;
            }*/