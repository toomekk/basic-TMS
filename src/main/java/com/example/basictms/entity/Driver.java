package com.example.basictms.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private List<DrivingLicense> licenses;

    public Driver() {
    }

    public Driver(String firstName, String lastName, List<DrivingLicense> license) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.licenses = license;
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
}
