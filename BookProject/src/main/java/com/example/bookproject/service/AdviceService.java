package com.example.bookproject.service;

import com.example.bookproject.dto.request.AdviceRequest;
import com.example.bookproject.entities.Advice;
import com.example.bookproject.repository.AdviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdviceService {
    private final AdviceRepository adviceRepository;

    public AdviceService(AdviceRepository adviceRepository) {
        this.adviceRepository = adviceRepository;
    }

    public Advice userAdvice(AdviceRequest request) {
        Advice advice = new Advice(request.getNameBook(), request.getNameAuthor(), request.getYourThoughts());
        return adviceRepository.save(advice);
    }

    public List<Advice> getAllAdvices() {
        return adviceRepository.findAll();
    }

    public void deleteUsersAdvices() {
        adviceRepository.deleteAll();
    }
}