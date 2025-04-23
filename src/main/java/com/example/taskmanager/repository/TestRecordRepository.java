package com.example.taskmanager.repository;

import com.example.taskmanager.model.TestRecords;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRecordRepository extends JpaRepository<TestRecords,Long> {


}
