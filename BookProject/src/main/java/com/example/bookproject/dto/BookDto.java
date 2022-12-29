package com.example.bookproject.dto;

import lombok.AllArgsConstructor;


public class BookDto {
    private Long id;
    private String name;
    private String author;

    public BookDto(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
