package com.example.basictms.request;


public class DriverRequest {


        private String firstName;
        private String lastName;
        private String license;

    public DriverRequest(String firstName, String lastName, String license) {
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

    public String getLicense() {
        return license;
    }
}
