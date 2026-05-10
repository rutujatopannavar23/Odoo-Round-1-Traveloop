package com.traveloop.backend.service;

import com.traveloop.backend.model.Notes;
import com.traveloop.backend.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotesService {

    @Autowired
    private NotesRepository notesRepository;

    public Notes saveNote(Notes note) {
        return notesRepository.save(note);
    }

    public List<Notes> getAllNotes() {
        return notesRepository.findAll();
    }
}