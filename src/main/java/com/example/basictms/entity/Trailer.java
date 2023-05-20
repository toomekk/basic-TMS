package com.example.basictms.entity;

import com.example.basictms.entity.enums.TrailerMark;
import com.example.basictms.entity.enums.TrailerType;
import jakarta.persistence.*;

@Entity
@Table (name = "trailer")
public class Trailer {
    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(EnumType.STRING)
    private TrailerMark trailerMark;
    @Enumerated(EnumType.STRING)
    private TrailerType trailerType;

    public Trailer(TrailerMark trailerMark, TrailerType trailerType) {
        this.trailerMark = trailerMark;
        this.trailerType = trailerType;
    }

    public Trailer() {
    }
    public TrailerMark getTrailerMark(){
        return trailerMark;
    }
    public void setTrailerMark(TrailerMark trailerMark){
        this.trailerMark = trailerMark;
    }
    public TrailerType getTrailerType(){
        return trailerType;
    }
    public void setTrailerType(TrailerType trailerType){
        this.trailerType = trailerType;
    }
}
