package com.traveloop.backend.controller;

import com.traveloop.backend.model.Activity;
import com.traveloop.backend.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/activities")
@CrossOrigin("*")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping
    public Activity createActivity(@RequestBody Activity activity) {
        return activityService.saveActivity(activity);
    }

    @GetMapping
    public List<Activity> getActivities() {
        return activityService.getAllActivities();
    }
}