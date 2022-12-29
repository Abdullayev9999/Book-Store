package com.example.bookproject.bookcontroller;

import com.example.bookproject.dto.BookDto;
import com.example.bookproject.dto.BookDtoWithCategory;
import com.example.bookproject.dto.request.BookRequest;
import com.example.bookproject.model.BookType;
import com.example.bookproject.service.LibraryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BooksController {

    private final LibraryService libraryService;

    public BooksController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/findByName")
    public List<BookDto> findByName(@RequestParam("name") String name) {
        return libraryService.findByName(name);
    }

    @DeleteMapping("/deleteById")
    public void deleteById(@RequestParam ("book_id") Long id){
        libraryService.deleteById(id);
    }

    @DeleteMapping("/deleteBooksByName/{name}")
    public void deleteByName(@PathVariable String name){
        libraryService.deleteByName(name);
    }

    @GetMapping("/findById")
    public ResponseEntity<List<BookDto>> getBookById(@RequestParam("id") Long id){
        return ResponseEntity.ok(libraryService.getBookById(id));
    }

    @PostMapping("/postBookType")
    public ResponseEntity<BookDtoWithCategory> postBook(@RequestBody BookRequest bookRequest, @RequestParam BookType bookType){
        return ResponseEntity.ok( libraryService.postBook(bookType, bookRequest) );
    }

    @DeleteMapping("/delete/all")
    public void deleteAllBooks(){
        libraryService.deleteAllBooks();
    }

    @GetMapping("/findByAuthor")
    public ResponseEntity<List<BookDto>> findByAuthor(@RequestParam("author") String author){
        return ResponseEntity.ok(libraryService.findByAuthor(author));
    }

    @GetMapping("/countBooks")
    public Long numberOfBooks(){
        return libraryService.numberOfBooks();
    }
}