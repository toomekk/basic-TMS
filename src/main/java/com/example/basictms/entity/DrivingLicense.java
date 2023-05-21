package com.example.basictms.entity;


public enum DrivingLicense {
    C1, C1E("C1+E"), CE("C+E");
    private String representation;


    DrivingLicense(String representation) {
        this.representation = representation;
    }
    DrivingLicense() {
        this.representation = name();
    }

    public String getRepresentation() {
        return representation;
    }


}
