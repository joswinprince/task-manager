package com.example.taskmanager.repository;

import com.example.taskmanager.model.Motivation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotivationRepository extends JpaRepository<Motivation, Long> {}
