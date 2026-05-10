package com.traveloop.backend.controller;

import com.traveloop.backend.model.Notes;
import com.traveloop.backend.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin("*")
public class NotesController {

    @Autowired
    private NotesService notesService;

    @PostMapping
    public Notes createNote(@RequestBody Notes note) {
        return notesService.saveNote(note);
    }

    @GetMapping
    public List<Notes> getNotes() {
        return notesService.getAllNotes();
    }
}