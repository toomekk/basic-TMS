package com.example.basictms.request;



import java.util.List;

public class DriverRequest {


        private String firstName;
        private String lastName;
        private List<String> license;

    public DriverRequest(String firstName, String lastName, List<String> license) {
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

    public List<String> getLicense() {
        return license;
    }

    public void setLicense(List<String> license) {
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

