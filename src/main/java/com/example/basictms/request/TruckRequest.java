package com.example.basictms.request;

import com.example.basictms.entity.enums.TruckBrand;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

public class TruckRequest {
// pola brand nie trzeba zabezpieczać - zawsze jest coś wybrane
    private TruckBrand brand;
    @NotEmpty(message = "ERROR ! Pole model nie może być puste!")
    private String model;
    @Min(value = 1, message = "ERROR ! masa pojazdu musi być większy od 1!")
    private String truckWeight;
    private String license;
    private long truckMileage;  //przebieg
    private String lastReviewDate;  //data ostatniego przeglądu
    private long reviewLimit;

    //private String TCO; //CAŁKOWITY KOSZT EKSPLOATACJI


    public TruckRequest(TruckBrand brand, String model, String truckWeight, String license, long truckMileage, String lastReviewDate, long reviewLimit) {
        this.brand = brand;
        this.model = model;
        this.truckWeight = truckWeight;
        this.license = String.valueOf(license);
        this.truckMileage = truckMileage;
        this.lastReviewDate = lastReviewDate;
        this.reviewLimit = reviewLimit;
    }

    public TruckRequest() {
    }

    public TruckBrand getBrand() {
        return brand;
    }

    public void setBrand(TruckBrand brand) {
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
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", truckWeight='" + truckWeight + '\'' +
                ", license='" + license + '\'' +
                ", truckMileage=" + truckMileage +
                ", lastReviewDate='" + lastReviewDate + '\'' +
                ", reviewLimit=" + reviewLimit +
                '}';
    }
}
