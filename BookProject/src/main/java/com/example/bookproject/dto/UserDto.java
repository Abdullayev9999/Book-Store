package com.example.bookproject.dto;

public class UserDto {

    private Long id;
    private String surname;
    private String name;

    public UserDto(Long id, String surname, String name) {
        this.id = id;
        this.surname = surname;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
}
