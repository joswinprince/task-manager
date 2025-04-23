package com.example.taskmanager.controller;

import com.example.taskmanager.model.TestRecords;
import com.example.taskmanager.service.TestRecordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/test_records")
public class TestRecordController {
    private final TestRecordService service;

    public TestRecordController(TestRecordService service) {
        this.service = service;
    }
    @GetMapping
    public List<TestRecords> getAllRecords() {
        return service.getAllTests();
    }
}
