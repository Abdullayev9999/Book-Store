package com.example.bookproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "advices")
public class Advice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "book_name", nullable = false)
    private String bookName;
    @Column(name = "book_author", nullable = false)
    private String autorName;
    @Column(name = "user_thoughts", nullable = false)
    private String userThoughts;

    public Advice(String bookName, String autorName, String userThoughts) {
        this.bookName = bookName;
        this.autorName = autorName;
        this.userThoughts = userThoughts;
    }

    public Advice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAutorName() {
        return autorName;
    }

    public void setAutorName(String autorName) {
        this.autorName = autorName;
    }

    public String getUserThoughts() {
        return userThoughts;
    }

    public void setUserThoughts(String userThoughts) {
        this.userThoughts = userThoughts;
    }
}
