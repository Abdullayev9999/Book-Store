package com.example.bookproject.dto.converter;

import com.example.bookproject.dto.BookDto;
import com.example.bookproject.dto.BookDtoWithCategory;
import com.example.bookproject.entities.Books;
import org.springframework.stereotype.Component;

@Component
public class BookConverter {

   private final CategoryConverter categoryConverter;

    public BookConverter(CategoryConverter categoryConverter) {
        this.categoryConverter = categoryConverter;
    }

    public BookDto convert(Books from){
        return new BookDto(
                from.getId(),
                from.getName(),
                from.getAuthor()
        );
    }

    public BookDtoWithCategory convert2(Books from){
        return new BookDtoWithCategory(
                from.getId(),
                from.getName(),
                from.getAuthor(),
                categoryConverter.convert(from.getCategory())
        );
    }

}
