package com.example.taskmanager.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Distraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String moodBefore;
    private String moodAfter;
    private int impactLevel;

    @ManyToOne
    private User user;
}
