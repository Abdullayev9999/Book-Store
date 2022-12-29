package com.example.bookproject.repository;

import com.example.bookproject.entities.Advice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdviceRepository extends JpaRepository<Advice, Long> {
}
