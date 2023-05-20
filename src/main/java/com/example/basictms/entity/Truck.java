package com.example.basictms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "trucks")
public class Truck {
    @Id
    @GeneratedValue
    private Long id;
    private String brand;
    private String model;
    private String truckWeight;
    private long truckMileage;  //przebieg
    private String lastReviewDate;  //data ostatniego przeglądu
    private long reviewLimit;

    @Enumerated(EnumType.STRING)
    private DrivingLicense license;

    //private String TCO; //CAŁKOWITY KOSZT EKSPLOATACJI
    //można rozbudowac o średnie spalanie, opony, przeglądy, naprawy, licencje dodatkowe



    public Truck() {
    }

    public Truck(String brand, String model, String truckWeight, DrivingLicense license) {
        this.brand = brand;
        this.model = model;
        this.truckWeight = truckWeight;
        this.license = license;
        this.truckMileage = truckMileage;
        this.lastReviewDate = lastReviewDate;
        this.reviewLimit = reviewLimit;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTruckWeight() {
        return truckWeight;
    }

    public void setTruckWeight(String truckWeight) {
        this.truckWeight = truckWeight;
    }

    public DrivingLicense getLicense() {
        return license;
    }

    public void setLicense(DrivingLicense license) {
        this.license = license;
    }

    public long getTruckMileage() {
        return truckMileage;
    }

    public void setTruckMileage(long truckMileage) {
        this.truckMileage = truckMileage;
    }

    public String getLastReviewDate() {
        return lastReviewDate;
    }

    public void setLastReviewDate(String lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
    }

    public long getReviewLimit() {
        return reviewLimit;
    }

    public void setReviewLimit(long reviewLimit) {
        this.reviewLimit = reviewLimit;
    }
}
