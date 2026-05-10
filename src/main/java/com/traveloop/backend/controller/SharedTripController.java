package com.traveloop.backend.controller;

import com.traveloop.backend.model.SharedTrip;
import com.traveloop.backend.service.SharedTripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/shared-trips")
@CrossOrigin("*")
public class SharedTripController {

    @Autowired
    private SharedTripService sharedTripService;

    @PostMapping
    public SharedTrip createSharedTrip(@RequestBody SharedTrip sharedTrip) {
        return sharedTripService.saveSharedTrip(sharedTrip);
    }

    @GetMapping
    public List<SharedTrip> getSharedTrips() {
        return sharedTripService.getAllSharedTrips();
    }
}