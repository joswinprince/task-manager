package com.example.taskmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Setter
@Getter
@Entity
public class Inspiration {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String source;
    private String type; // quote, experience, book
    private int impactLevel;
    private LocalDate date;

    @ManyToOne
    private User user;
}
