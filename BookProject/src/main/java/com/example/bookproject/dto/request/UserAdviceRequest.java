package com.example.bookproject.dto.request;

public class UserAdviceRequest {
    private String book;
    private String author;

    public UserAdviceRequest(String book, String author) {
        this.book = book;
        this.author = author;
    }

    public String getBook() {
        return book;
    }

    public String getAuthor() {
        return author;
    }
}