package com.traveloop.backend.controller;

import com.traveloop.backend.model.Stop;
import com.traveloop.backend.service.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/stops")
@CrossOrigin("*")
public class StopController {

    @Autowired
    private StopService stopService;

    @PostMapping
    public Stop createStop(@RequestBody Stop stop) {
        return stopService.saveStop(stop);
    }

    @GetMapping
    public List<Stop> getStops() {
        return stopService.getAllStops();
    }
}