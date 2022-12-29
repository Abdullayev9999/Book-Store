package com.example.bookproject.repository;

import com.example.bookproject.dto.BookDto;
import com.example.bookproject.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibraryRepository extends JpaRepository<Books, Long> {

    List<BookDto> getBookById(Long id);

    List<BookDto> getBookByAuthor(String author);

    List<BookDto> findByName(String name);

    void deleteAllByName(String name);
}