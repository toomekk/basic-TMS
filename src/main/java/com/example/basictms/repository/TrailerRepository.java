package com.example.basictms.repository;

import com.example.basictms.entity.Truck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrailerRepository extends JpaRepository<Truck, Long> {
}
