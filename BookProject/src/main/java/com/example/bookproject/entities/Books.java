package com.example.bookproject.entities;

import com.example.bookproject.model.BookType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "author", nullable = false)
    private String author;

    @ManyToOne(fetch = FetchType.LAZY)
//    @JsonIgnore
    private Category category;

    @ManyToMany
    @JoinTable(name = "users_books", joinColumns = @JoinColumn(name = "book_id", unique = false),
            inverseJoinColumns = @JoinColumn(name = "user_id", unique = false))
    private Set<User> users;


    public Books(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Books(String name, String author, Category category) {
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public Books() {
    }

    public Books(Long id, String name, String author, Category category, Set<User> users) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
        this.users = users;
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


    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}