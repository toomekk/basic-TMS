package com.example.basictms.repository;

import com.example.basictms.entity.Driver;
import com.example.basictms.entity.Truck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TruckRepository extends JpaRepository<Truck, Long> {
    Optional<Truck> findById(Long id);
}
