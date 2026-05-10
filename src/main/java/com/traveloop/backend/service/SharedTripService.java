package com.traveloop.backend.service;

import com.traveloop.backend.model.SharedTrip;
import com.traveloop.backend.repository.SharedTripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SharedTripService {

    @Autowired
    private SharedTripRepository sharedTripRepository;

    public SharedTrip saveSharedTrip(SharedTrip sharedTrip) {
        return sharedTripRepository.save(sharedTrip);
    }

    public List<SharedTrip> getAllSharedTrips() {
        return sharedTripRepository.findAll();
    }
}