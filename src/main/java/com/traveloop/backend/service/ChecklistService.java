package com.traveloop.backend.service;

import com.traveloop.backend.model.Checklist;
import com.traveloop.backend.repository.ChecklistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ChecklistService {

    @Autowired
    private ChecklistRepository checklistRepository;

    public Checklist saveChecklist(Checklist checklist) {
        return checklistRepository.save(checklist);
    }

    public List<Checklist> getAllChecklists() {
        return checklistRepository.findAll();
    }
}