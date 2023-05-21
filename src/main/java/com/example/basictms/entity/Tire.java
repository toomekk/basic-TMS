package com.example.basictms.entity;

import com.example.basictms.entity.enums.NewUsedTire;
import com.example.basictms.entity.enums.TireBrand;
import jakarta.persistence.*;

@Entity
@Table (name = "tire")
public class Tire {
    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(EnumType.STRING)
    private TireBrand tireBrand;
    private NewUsedTire newUsedTire; // czy opona jest nowa
    private int tireLifeKm; //żywotność opony w km

    public Tire(TireBrand tireBrand, NewUsedTire newUsedTire, int tireLifeKm) {
        this.tireBrand = tireBrand;
        this.newUsedTire = newUsedTire;
        this.tireLifeKm = tireLifeKm;
    }

    public Tire() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TireBrand getTireBrand() {
        return tireBrand;
    }

    public void setTireBrand(TireBrand tireBrand) {
        this.tireBrand = tireBrand;
    }

    public NewUsedTire getNewUsedTire() {
        return newUsedTire;
    }

    public void setNewUsedTire(NewUsedTire newUsedTire) {
        this.newUsedTire = newUsedTire;
    }

    public int getTireLifeKm() {
        return tireLifeKm;
    }

    public void setTireLifeKm(int tireLifeKm) {
        this.tireLifeKm = tireLifeKm;
    }
}
