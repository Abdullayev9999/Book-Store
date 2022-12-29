package com.example.bookproject.bookcontroller;

import com.example.bookproject.dto.UsersBooksDto;
import com.example.bookproject.dto.request.UsersBooksRequest;
import com.example.bookproject.service.UsersBooksService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersBooksController {
    private final UsersBooksService usersBooksService;

    public UsersBooksController(UsersBooksService usersBooksService) {
        this.usersBooksService = usersBooksService;
    }

    @PostMapping("/register")
    public ResponseEntity<UsersBooksDto> addNewUsersBooks(@RequestBody UsersBooksRequest request) {
        return ResponseEntity.ok(usersBooksService.addNewUsersBooks(request));
    }
}