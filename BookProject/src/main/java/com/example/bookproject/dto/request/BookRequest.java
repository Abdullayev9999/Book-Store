package com.example.bookproject.dto.request;

import lombok.Getter;

public class BookRequest {
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}