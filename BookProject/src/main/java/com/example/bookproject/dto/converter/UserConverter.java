package com.example.bookproject.dto.converter;

import com.example.bookproject.dto.UserDto;
import com.example.bookproject.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserDto convert(User from){
        return new UserDto(
                from.getId(),
                from.getSurname(),
                from.getName()
        );
    }
}