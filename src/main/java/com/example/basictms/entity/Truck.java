package com.example.basictms.entity;

import com.example.basictms.entity.enums.TruckBrand;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

@Entity
@Table(name = "trucks")
public class Truck {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private TruckBrand brand;
    @NotBlank
    private String model;
    @NotBlank
    private String truckWeight;
    @Min(1)
    private long truckMileage;  //przebieg
    @Past
    private String lastReviewDate;  //data ostatniego przeglądu
    private long reviewLimit;

    @Enumerated(EnumType.STRING)
    private DrivingLicense license;

    //private String TCO; //CAŁKOWITY KOSZT EKSPLOATACJI
    //można rozbudowac o średnie spalanie, opony, przeglądy, naprawy, licencje dodatkowe



    public Truck() {
    }

    public Truck(TruckBrand brand, String model, String truckWeight, long truckMileage, String lastReviewDate, long reviewLimit,
                 DrivingLicense license) {
        this.brand = brand;
        this.model = model;
        this.truckWeight = truckWeight;
        this.truckMileage = truckMileage;
        this.lastReviewDate = lastReviewDate;
        this.reviewLimit = reviewLimit;
        this.license = license;
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

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", brand=" + brand +
                ", model='" + model + '\'' +
                ", truckWeight='" + truckWeight + '\'' +
                ", truckMileage=" + truckMileage +
                ", lastReviewDate='" + lastReviewDate + '\'' +
                ", reviewLimit=" + reviewLimit +
                ", license=" + license +
                '}';
    }
}
