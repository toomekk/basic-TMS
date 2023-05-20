package com.example.basictms.request;

import com.example.basictms.entity.DrivingLicense;
import com.example.basictms.entity.TruckBrand;

public class TruckRequest {
    private TruckBrand brand;
    private String model;
    private String truckWeight;
    private String license;

    //private String TCO; //CAŁKOWITY KOSZT EKSPLOATACJI


    public TruckRequest(TruckBrand brand, String model, String truckWeight, DrivingLicense license) {
        this.brand = brand;
        this.model = model;
        this.truckWeight = truckWeight;
        this.license = String.valueOf(license);
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
