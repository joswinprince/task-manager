package com.example.taskmanager.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class DisciplineTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskName;
    private String frequency; // daily, weekly
    private String status;
    private LocalDate date;

    @ManyToOne
    private User user;
}
