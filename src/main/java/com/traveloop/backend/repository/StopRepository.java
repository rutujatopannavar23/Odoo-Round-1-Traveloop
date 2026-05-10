package com.traveloop.backend.repository;

import com.traveloop.backend.model.Stop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StopRepository extends JpaRepository<Stop, Long> {
}