package com.example.taskmanager.repository;

import com.example.taskmanager.model.Inspiration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InspirationRepository extends JpaRepository<Inspiration, Long> {


//    List<Inspiration> findByUserId(Long userId);
    Page<Inspiration> findByUserId(Long userId, Pageable pageable); // ✅ Correct signature

}