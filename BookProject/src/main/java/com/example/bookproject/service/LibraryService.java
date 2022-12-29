package com.example.bookproject.service;

import com.example.bookproject.dto.BookDto;
import com.example.bookproject.dto.BookDtoWithCategory;
import com.example.bookproject.dto.converter.BookConverter;
import com.example.bookproject.dto.request.BookRequest;
import com.example.bookproject.entities.Books;
import com.example.bookproject.entities.Category;
import com.example.bookproject.model.BookType;
import com.example.bookproject.repository.LibraryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//@Transactional
public class LibraryService {
    private final LibraryRepository libraryRepository;
    private final CategoryService categoryService;

    private final BookConverter bookConverter;

    public LibraryService(LibraryRepository libraryRepository, CategoryService categoryService, BookConverter bookConverter) {
        this.libraryRepository = libraryRepository;
        this.categoryService = categoryService;
        this.bookConverter = bookConverter;
    }


    public List<BookDto> findByName(String name) {
       return libraryRepository.findByName(name);
    }

    public void deleteById(Long id) {
        libraryRepository.deleteById(id);
    }

    public List<BookDto> getBookById(Long id) {
        return libraryRepository.getBookById(id);
    }

    public BookDtoWithCategory postBook(BookType bookType, BookRequest bookRequest) {
        Category category = categoryService.findCategoryByName(bookType.name());
        Books book = new Books(bookRequest.getName(), bookRequest.getAuthor(), category);
        return bookConverter.convert2(libraryRepository.save(book));
    }

    public void deleteAllBooks() {
        libraryRepository.deleteAll();
    }


    public List<BookDto> findByAuthor(String author) {
        return libraryRepository.getBookByAuthor(author);
    }

    @Transactional
    public void deleteByName(String name) {
        libraryRepository.deleteAllByName(name);
    }

    public Long numberOfBooks() {
        return libraryRepository.count();
    }
}