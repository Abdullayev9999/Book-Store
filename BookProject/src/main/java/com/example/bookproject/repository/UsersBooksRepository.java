package com.example.bookproject.repository;

import com.example.bookproject.entities.UsersBooks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersBooksRepository extends JpaRepository<UsersBooks, Long> {
}