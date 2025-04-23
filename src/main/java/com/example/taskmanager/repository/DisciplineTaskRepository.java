package com.example.taskmanager.repository;

import com.example.taskmanager.model.DisciplineTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplineTaskRepository extends JpaRepository<DisciplineTask, Long> {}