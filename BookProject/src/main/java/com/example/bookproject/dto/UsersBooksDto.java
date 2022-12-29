package com.example.bookproject.dto;

public class UsersBooksDto {
    private Long id;
    private Long bookId;
    private Long UserId;

    public UsersBooksDto(Long id, Long bookId, Long userId) {
        this.id = id;
        this.bookId = bookId;
        UserId = userId;
    }
}
