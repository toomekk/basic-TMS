package com.example.basictms.request;

import java.time.LocalDate;

public class OrderCreationRequest {
    private String startingPoint;
    private String destination;
    private LocalDate startDate;
    private LocalDate endDate;
    private double offeredPrice;

    public OrderCreationRequest(String startingPoint, String destination, LocalDate startDate, LocalDate endDate, double offeredPrice) {
        this.startingPoint = startingPoint;
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
        this.offeredPrice = offeredPrice;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getOfferedPrice() {
        return offeredPrice;
    }

    public void setOfferedPrice(double offeredPrice) {
        this.offeredPrice = offeredPrice;
    }

    @Override
    public String toString() {
        return "OrderCreationRequest{" +
                "startingPoint='" + startingPoint + '\'' +
                ", destination='" + destination + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
