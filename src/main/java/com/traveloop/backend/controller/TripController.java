package com.traveloop.backend.controller;

import com.traveloop.backend.model.Trip;
import com.traveloop.backend.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/trips")
@CrossOrigin("*")
public class TripController {

    @Autowired
    private TripService tripService;

    @PostMapping
    public Trip createTrip(@RequestBody Trip trip) {
        return tripService.saveTrip(trip);
    }

    @GetMapping
    public List<Trip> getTrips() {
        return tripService.getAllTrips();
    }
}