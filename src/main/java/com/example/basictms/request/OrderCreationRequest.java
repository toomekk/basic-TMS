package com.example.basictms.request;

import java.time.LocalDate;

public class OrderCreationRequest {
    private String startingPoint;
    private String destination;
    private LocalDate startDate;
    private LocalDate endDate;

    public OrderCreationRequest(String startingPoint, String destination, LocalDate startDate, LocalDate endDate) {
        this.startingPoint = startingPoint;
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
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
