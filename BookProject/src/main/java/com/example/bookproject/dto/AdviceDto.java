package com.example.bookproject.dto;

public class AdviceDto {

    private String nameBook;

    private String nameAuthor;

    private String yourThoughts;

    public AdviceDto(String nameBook, String nameAuthor, String yourThoughts) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.yourThoughts = yourThoughts;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getYourThoughts() {
        return yourThoughts;
    }
}
