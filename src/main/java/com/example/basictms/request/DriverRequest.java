package com.example.basictms.request;



import com.example.basictms.entity.DrivingLicense;

import java.util.List;

public class DriverRequest {


        private String firstName;
        private String lastName;
        private List<DrivingLicense> license;

    public DriverRequest(String firstName, String lastName, List<DrivingLicense> license) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.license = license;
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

    public List<DrivingLicense> getLicense() {
        return license;
    }

    public void setLicense(List<DrivingLicense> license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "DriverRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", license='" + license + '\'' +
                '}';
    }
}

