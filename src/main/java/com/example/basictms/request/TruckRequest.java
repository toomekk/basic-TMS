package com.example.basictms.request;

import com.example.basictms.entity.DrivingLicense;

public class TruckRequest {
    private String brand;
    private String model;
    private String truckWeight;
    private String license;

    //private String TCO; //CAŁKOWITY KOSZT EKSPLOATACJI


    public TruckRequest(String brand, String model, String truckWeight, String license, long truckMileage, String lastReviewDate, long reviewLimit) {
        this.brand = brand;
        this.model = model;
        this.truckWeight = truckWeight;
        this.license = String.valueOf(license);
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

    @Override
    public String toString() {
        return "TruckRequest{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", truckWeight='" + truckWeight + '\'' +
                ", license='" + license + '\'' +
                '}';
    }
}
