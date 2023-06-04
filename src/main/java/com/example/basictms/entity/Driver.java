package com.example.basictms.entity;

import jakarta.persistence.*;
import org.aspectj.weaver.ast.Or;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private long salary;
    @Enumerated(EnumType.STRING)
    private List<DrivingLicense> licenses;
    @OneToMany(mappedBy = "driver",fetch = FetchType.EAGER)
    private List<Order> orders = new ArrayList<>();

    public Driver() {
    }

    public Driver(String firstName, String lastName, List<DrivingLicense> license) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.licenses = license;
        this.salary = salary;
    }

    public void addOrder(Order order){
        orders.add(order);
        order.setDriver(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<DrivingLicense> getLicenses() {
        return licenses;
    }

    public void setLicenses(List<DrivingLicense> license) {
        this.licenses = license;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
