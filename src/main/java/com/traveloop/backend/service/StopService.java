package com.traveloop.backend.service;

import com.traveloop.backend.model.Stop;
import com.traveloop.backend.repository.StopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StopService {

    @Autowired
    private StopRepository stopRepository;

    public Stop saveStop(Stop stop) {
        return stopRepository.save(stop);
    }

    public List<Stop> getAllStops() {
        return stopRepository.findAll();
    }
}