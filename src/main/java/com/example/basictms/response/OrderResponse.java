package com.example.basictms.response;

import com.example.basictms.entity.enums.OrderStatus;
import java.time.LocalDate;
import java.util.Objects;

public class OrderResponse {

    private String startingPoint;
    private String destination;
    private LocalDate startDate;
    private LocalDate endDate;

    private OrderStatus orderStatus;
    private double offeredPrice;

    public OrderResponse(String startingPoint, String destination, LocalDate startDate, LocalDate endDate, OrderStatus orderStatus, double offeredPrice) {
        this.startingPoint = startingPoint;
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
        this.orderStatus = orderStatus;
        this.offeredPrice = offeredPrice;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public double getOfferedPrice() {
        return offeredPrice;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderResponse that = (OrderResponse) o;
        return offeredPrice == that.offeredPrice && Objects.equals(startingPoint, that.startingPoint) && orderStatus == that.orderStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderStatus);
    }

    @Override
    public String toString() {
        return "OrderResponse{" +
                "startingPoint='" + startingPoint + '\'' +
                ", destination='" + destination + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", orderStatus=" + orderStatus +
                ", offeredPrice=" + offeredPrice +
                '}';
    }
}
