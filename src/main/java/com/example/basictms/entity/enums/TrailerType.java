package com.example.basictms.entity.enums;

public enum TrailerType {
    TIPPER_TRAILER( 20000), // wywrotka
    CURTAIN_TRAILER(25000), //kurtyna
    REFRIGERATOR_TRAILER(15000), //chłodnia
    TILT_TRAILER(30000), //plandeka
    FLATBED_TRAILER(40000); //platforma
    private int maxWeight;

    TrailerType(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    TrailerType() {
    }
}
