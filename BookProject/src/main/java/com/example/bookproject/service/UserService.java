package com.example.bookproject.service;

import com.example.bookproject.dto.UserDto;
import com.example.bookproject.dto.converter.UserConverter;
import com.example.bookproject.dto.request.UserRequest;
import com.example.bookproject.entities.User;
import com.example.bookproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final UserConverter userConverter;

    public UserService(UserRepository userRepository, UserConverter userConverter) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
    }

    public UserDto addNewUser(UserRequest request) {
        User user = new User(request.getSurname(), request.getName(), request.getPassword());
        return userConverter.convert(userRepository.save(user));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Long numberOfUsers() {
        return userRepository.count();
    }
}