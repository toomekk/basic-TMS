package com.example.basictms.request;

import com.example.basictms.entity.enums.NewUsedTire;
import com.example.basictms.entity.enums.TireBrand;

public class TireRequest {
    private TireBrand tireBrand;

    private NewUsedTire newUsedTire;
    private int tireLifeKm;

    public TireRequest(TireBrand tireBrand, NewUsedTire newUsedTire, int tireLifeKm) {
        this.tireBrand = tireBrand;
        this.newUsedTire = newUsedTire;
        this.tireLifeKm = tireLifeKm;
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
