package com.example.basictms.request;

import com.example.basictms.entity.DrivingLicense;

public class TruckRequest {
    private String brand;
    private String model;
    private String truckWeight;
    private String license;
    private long truckMileage;  //przebieg
    private String lastReviewDate;  //data ostatniego przeglądu
    private long reviewLimit;

    private String coś;

    //private String TCO; //CAŁKOWITY KOSZT EKSPLOATACJI


    public TruckRequest(String brand, String model, String truckWeight, String license, long truckMileage, String lastReviewDate, long reviewLimit) {
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

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
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

    @Override
    public String toString() {
        return "TruckRequest{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", truckWeight='" + truckWeight + '\'' +
                ", license='" + license + '\'' +
                ", truckMileage=" + truckMileage +
                ", lastReviewDate='" + lastReviewDate + '\'' +
                ", reviewLimit=" + reviewLimit +
                '}';
    }
}
