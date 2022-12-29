package com.example.bookproject.model;

public enum BookType {
    BOOK_TYPE("Book Types"),
    Classic("Classic"),
    DetectiveAndMystery("Detective and Mystery"),
    Fantasy("Fantasy"),
    Horror("Horror");

    private final String name;

    BookType(String name) {
        this.name = name;
    }
}
