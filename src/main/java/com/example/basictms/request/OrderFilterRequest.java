package com.example.basictms.request;

import java.util.Objects;

public class OrderFilterRequest {

    private String orderStatus;
    public String getOrderStatus(){return orderStatus;}

    public void setOrderStatus(String orderStatus){this.orderStatus = orderStatus;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderFilterRequest that = (OrderFilterRequest) o;
        return Objects.equals(orderStatus, that.orderStatus );   }

    @Override
    public int hashCode() {
        return Objects.hash(orderStatus);
    }

    @Override
    public String toString() {
        return "OrderFilterRequest{" +
                "orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
