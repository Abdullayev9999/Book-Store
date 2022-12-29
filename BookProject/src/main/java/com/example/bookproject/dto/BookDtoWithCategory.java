package com.example.bookproject.dto;

public class BookDtoWithCategory {

    private Long id;
    private String name;
    private String author;
    private CategoryDto category;

    public BookDtoWithCategory(Long id, String name, String author, CategoryDto category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }
}
