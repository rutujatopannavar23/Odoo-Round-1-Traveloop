package com.traveloop.backend.model;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "activities")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String activityName;

    private String category;

    private Double cost;

    private Integer durationHours;

    private String notes;

    @ManyToOne
    @JoinColumn(name = "stop_id")
    @JsonIgnore
    private Stop stop;
}