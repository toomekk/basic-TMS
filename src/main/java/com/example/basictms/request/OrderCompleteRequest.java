package com.example.basictms.request;

public class OrderCompleteRequest {
    private long orderId;
    private long driverId;


    public long getOrderId() {
        return orderId;
    }

    public long getDriverId() {
        return driverId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setDriverId(long driverId) {
        this.driverId = driverId;
    }

    @Override
    public String toString() {
        return "OrderCompleteRequest{" +
                "orderId=" + orderId +
                ", driverId=" + driverId +
                '}';
    }
}
