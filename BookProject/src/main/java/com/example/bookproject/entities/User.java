package com.example.bookproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String surname;

    private String name;
    @Column(name = "password")
    private String password;

    @ManyToMany(mappedBy = "users")
//    @JsonIgnore
    private Set<Books> books;

    public User(Long id, String surname, String name, String password, Set<Books> books) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.password = password;
        this.books = books;
    }

    public User() {
    }

    public User(String surname, String name, String password) {
        this.surname = surname;
        this.name = name;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
