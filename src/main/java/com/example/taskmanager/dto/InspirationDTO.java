package com.example.taskmanager.dto;

import com.example.taskmanager.model.Inspiration;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class InspirationDTO {
    private Long id;
    private String source;
    private String type;
    private int impactLevel;
    private LocalDate date;
    private String username;

    public InspirationDTO(Inspiration inspiration) {
        this.id = inspiration.getId();
        this.source = inspiration.getSource();
        this.type = inspiration.getType();
        this.impactLevel = inspiration.getImpactLevel();
        this.date = inspiration.getDate();
        // Null-check to avoid NPE
        if (inspiration.getUser() != null) {
            this.username = inspiration.getUser().getUsername();
        } else {
            this.username = "Unknown";
        }
    }

    // Getters (Lombok optional)
}
