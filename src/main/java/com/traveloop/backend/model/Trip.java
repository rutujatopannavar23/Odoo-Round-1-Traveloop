package com.traveloop.backend.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "trips")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tripName;

    private String description;

    private LocalDate startDate;

    private LocalDate endDate;

    private Double budgetLimit;

    private String visibility;

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL)
    private List<Stop> stops;
}