package com.example.taskmanager.repository;

import com.example.taskmanager.model.Distraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistractionRepository extends JpaRepository<Distraction, Long> {}