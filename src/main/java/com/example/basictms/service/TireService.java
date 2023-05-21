package com.example.basictms.service;

import com.example.basictms.entity.Tire;
import com.example.basictms.repository.TireRepository;
import com.example.basictms.request.TireRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class TireService {
    private TireRepository tireRepository;

    public TireService(TireRepository tireRepository) {
        this.tireRepository = tireRepository;
    }
    public void addTire(TireRequest tireRequest){
        Tire tire = new Tire(tireRequest.getTireBrand(),tireRequest.getNewUsedTire(), tireRequest.getTireLifeKm());
        tireRepository.save(tire);
    }
}
