package com.example.basictms.request;

public class OrderCompleteRequest {
    private long orderId;
    private long driverId;
    private long truckId;


    public long getOrderId() {
        return orderId;
    }

    public long getDriverId() {
        return driverId;
    }
    public long getTruckId(){
        return truckId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setDriverId(long driverId) {
        this.driverId = driverId;
    }

    public void setTruckId(long truckId) {
        this.truckId = truckId;
    }

    @Override
    public String toString() {
        return "OrderCompleteRequest{" +
                "orderId=" + orderId +
                ", driverId=" + driverId +
                '}';
    }
}
