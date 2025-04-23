package com.example.taskmanager.controller;

import com.example.taskmanager.model.Inspiration;
import com.example.taskmanager.repository.InspirationRepository;
import com.example.taskmanager.dto.InspirationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/inspiration")
@CrossOrigin(origins = "http://localhost:3000")

public class InspirationController {
    
    @Autowired
    private InspirationRepository inspirationRepo;
    @GetMapping

    public List<Inspiration> getAll(){
        return inspirationRepo.findAll();
    }
    @PostMapping
    public Inspiration addInspiration(@RequestBody Inspiration inspiration) {
        return inspirationRepo.save(inspiration);
    }
/*
    @GetMapping("/user/{userId}")
    public List<Inspiration> getByUser(@PathVariable Long userId) {
//        return inspirationRepo.findAll().stream()
//            .filter(i -> i.getUser().getId().equals(userId))
//            .collect(Collectors.toList());
        return inspirationRepo.findByUserId(userId);
    }
*/
    @GetMapping("/user/{userId}")
    public List<InspirationDTO> getByUser(
            @PathVariable("userId") Long userId,
            Pageable pageable
    ) {
        return inspirationRepo.findByUserId(userId, pageable)
                .getContent()
                .stream()
                .map(InspirationDTO::new)
                .collect(Collectors.toList());
    }

}
