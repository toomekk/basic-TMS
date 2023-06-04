package com.example.basictms.repository;

import com.example.basictms.entity.Driver;
import com.example.basictms.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver,Long> {
    Optional<Driver> findById(Long id);
}
