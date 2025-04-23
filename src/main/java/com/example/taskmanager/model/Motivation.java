package com.example.taskmanager.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Motivation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String goal;
    private int energyLevel;
    private String mood;
    private LocalDate date;

    @ManyToOne
    private User user;
}
