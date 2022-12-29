package com.example.bookproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "users_books")
public class UsersBooks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "book_id", unique = false)
    private Long bookId;
    @Column(name = "user_id", unique = false)
    private Long userId;

    public UsersBooks(Long id, Long bookId, Long userId) {
        this.id = id;
        this.bookId = bookId;
        this.userId = userId;
    }

    public UsersBooks() {
    }

    public UsersBooks(Long bookId, Long userId) {
        this.bookId = bookId;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
