package com.example.bookproject.dto.converter;

import com.example.bookproject.dto.CategoryDto;
import com.example.bookproject.entities.Category;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryConverter {

    public CategoryDto convert(Category from){
        return new CategoryDto(
                from.getCategoryId(),
                from.getCategoryName()
        );
    }

    public List<CategoryDto> convert(List<Category> fromList){
        return fromList.stream()
                .map(this::convert).collect(Collectors.toList());
    }
}
