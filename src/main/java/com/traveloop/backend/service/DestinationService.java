package com.traveloop.backend.service;

import com.traveloop.backend.model.Destination;
import com.traveloop.backend.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;

    public List<Destination> getAllDestinations() {
        return destinationRepository.findAll();
    }

    public Destination saveDestination(Destination destination) {
        return destinationRepository.save(destination);
    }
}