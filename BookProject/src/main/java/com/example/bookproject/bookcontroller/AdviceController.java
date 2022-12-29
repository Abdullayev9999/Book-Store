package com.example.bookproject.bookcontroller;


import com.example.bookproject.dto.request.AdviceRequest;
import com.example.bookproject.entities.Advice;
import com.example.bookproject.service.AdviceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdviceController {

    private final AdviceService adviceService;

    public AdviceController(AdviceService adviceService) {
        this.adviceService = adviceService;
    }

    @GetMapping("/allUsersAdvices")
    public List<Advice> getAllAdvices(){
        return  adviceService.getAllAdvices();
    }

    @PostMapping("/userAdvice")
    public ResponseEntity<Advice> userAdvice(@RequestBody AdviceRequest request){
        return ResponseEntity.ok(adviceService.userAdvice(request));
    }

    @DeleteMapping("delete/usersAdvices")
    public void deleteUsersAdvices(){
        adviceService.deleteUsersAdvices();
    }
}
