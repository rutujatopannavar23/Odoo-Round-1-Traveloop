package com.traveloop.backend.repository;

import com.traveloop.backend.model.SharedTrip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SharedTripRepository extends JpaRepository<SharedTrip, Long> {
}