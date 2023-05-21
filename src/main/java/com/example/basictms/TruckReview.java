package com.example.basictms;
import java.sql.*;
import java.time.LocalDate;

public class TruckReview {

   /private long reviewLimit = 30000;
    private long truckMileage = 10500;

    private String lastReviewDate = "2022-03-03";
    long remainingKilometers = reviewLimit - truckMileage;

    /*if(remainingKilometers >0){
        System.out.println("Pozostało " + remainingKilometers + " km do przeglądu.");
        checkReminder(truckMileage, reviewLimit, lastReviewDate);
    } else

    {
        LocalDate ostatniPrzeglad = LocalDate.parse(lastReviewDate);
        LocalDate today = LocalDate.now();
        long daysLeft = today.toEpochDay() - ostatniPrzeglad.toEpochDay();

        if (daysLeft >= 365) {
            System.out.println("Przegląd jest już wymagany!");
            saveMileageToDB(reviewLimit, today.toString());
        } else {
            System.out.println("Przegląd nie jest jeszcze wymagany.");
            checkReminder(truckMileage, reviewLimit, lastReviewDate);
        }
    }


    private static void checkReminder(long truckMileage, long reviewLimit, String lastReviewDate) {
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