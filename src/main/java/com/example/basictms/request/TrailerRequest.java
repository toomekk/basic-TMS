package com.example.basictms.request;

public class TrailerRequest {
    private String model;
    private String trailerWeight;
    private String brand;

    public TrailerRequest(String model, String trailerWeight, String brand) {
        this.model = model;
        this.trailerWeight = trailerWeight;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getTrailerWeight() {
        return trailerWeight;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTrailerWeight(String trailerWeight) {
        this.trailerWeight = trailerWeight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "TrailerRequest{" +
                "model='" + model + '\'' +
                ", trailerWeight='" + trailerWeight + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
