package com.example.taskmanager.service;

import java.util.List;
import com.example.taskmanager.model.TestRecords;
import com.example.taskmanager.repository.TaskRepository;
import com.example.taskmanager.repository.TestRecordRepository;
import org.springframework.stereotype.Service;


@Service
public class TestRecordService {
    private final TestRecordRepository repository;

    public TestRecordService(TestRecordRepository repository) {
        this.repository = repository;
    }
    public List<TestRecords> getAllTests()
    {
        return repository.findAll();
    }
    public TestRecords createRecord(TestRecords records)
    {
        return repository.save(records);
    }

    public TestRecords updateRecord(Long id,TestRecords updated)
    {
        return repository.findById(id).map(record -> {
            record.setName(updated.getName());
            record.setValue(updated.getValue());
            return repository.save(record);
        }).orElseThrow(()-> new RuntimeException("Record not found"));
    }
}
