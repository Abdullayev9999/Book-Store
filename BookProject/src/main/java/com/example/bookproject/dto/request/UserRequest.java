package com.example.bookproject.dto.request;

import lombok.Getter;


public class UserRequest {
    private String surname;
    private String name;

    private String password;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}