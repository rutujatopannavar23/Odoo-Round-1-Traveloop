package com.traveloop.backend.controller;

import com.traveloop.backend.model.Checklist;
import com.traveloop.backend.service.ChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/checklists")
@CrossOrigin("*")
public class ChecklistController {

    @Autowired
    private ChecklistService checklistService;

    @PostMapping
    public Checklist createChecklist(@RequestBody Checklist checklist) {
        return checklistService.saveChecklist(checklist);
    }

    @GetMapping
    public List<Checklist> getChecklists() {
        return checklistService.getAllChecklists();
    }
}