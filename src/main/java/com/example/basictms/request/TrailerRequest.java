package com.example.basictms.request;

import com.example.basictms.entity.enums.TrailerMark;
import com.example.basictms.entity.enums.TrailerType;

public class TrailerRequest {
    private TrailerType trailerType;
    private TrailerMark trailerMark;

    public TrailerRequest(TrailerType trailerType, TrailerMark trailerMark) {
        this.trailerType = trailerType;
        this.trailerMark = trailerMark;
    }

    public TrailerType getTrailerType() {
        return trailerType;
    }

    public TrailerMark getTrailerMark() {
        return trailerMark;
    }

    public void setTrailerType(TrailerType trailerType) {
        this.trailerType = trailerType;
    }

    public void setTrailerMark(TrailerMark trailerMark) {
        this.trailerMark = trailerMark;
    }

    @Override
    public String toString() {
        return "TrailerRequest{" +
                "trailerType=" + trailerType +
                ", trailerMark=" + trailerMark +
                '}';
    }

}
