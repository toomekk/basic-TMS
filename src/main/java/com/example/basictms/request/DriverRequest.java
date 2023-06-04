package com.example.basictms.request;



import com.example.basictms.entity.DrivingLicense;
import com.example.basictms.entity.enums.SalaryType;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public class DriverRequest {

        @NotEmpty(message = "ERROR ! Imię nie może być puste!")
        private String firstName;
        @NotEmpty(message = "ERROR ! Nazwisko nie może być puste!")
        private String lastName;
        private SalaryType salaryType;
        private List<DrivingLicense> license;

    public DriverRequest(String firstName, String lastName, SalaryType salaryType, List<DrivingLicense> license) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryType = salaryType;
        this.license = license;
    }

    public DriverRequest() {

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

    public SalaryType getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(SalaryType salaryType) {
        this.salaryType = salaryType;
    }

    @Override
    public String toString() {
        return "DriverRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salaryType=" + salaryType +
                ", license=" + license +
                '}';
    }
}

