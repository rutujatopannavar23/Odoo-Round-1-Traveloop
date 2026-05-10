package com.traveloop.backend.repository;

import com.traveloop.backend.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Notes, Long> {
}