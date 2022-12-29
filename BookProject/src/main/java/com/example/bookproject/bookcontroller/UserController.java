package com.example.bookproject.bookcontroller;

import com.example.bookproject.dto.UserDto;
import com.example.bookproject.dto.request.UserRequest;
import com.example.bookproject.entities.User;
import com.example.bookproject.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping("/register")
    public ResponseEntity<UserDto> addNewUser(@RequestBody UserRequest request) {
        return ResponseEntity.ok(userService.addNewUser(request));
    }

    @GetMapping("/countUsers")
    public Long numberOfUsers(){
        return userService.numberOfUsers();
    }
}