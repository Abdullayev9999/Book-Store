package com.example.bookproject.service;

import com.example.bookproject.dto.CategoryDto;
import com.example.bookproject.dto.converter.CategoryConverter;
import com.example.bookproject.dto.request.CategoryRequest;
import com.example.bookproject.entities.Category;
import com.example.bookproject.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    private final CategoryConverter categoryConverter;


    public CategoryService(CategoryRepository categoryRepository, CategoryConverter categoryConverter) {
        this.categoryRepository = categoryRepository;
        this.categoryConverter = categoryConverter;
    }

    protected Category findCategoryByName(String categoryName) {
        return categoryRepository.findByCategoryName(categoryName);
    }

    public CategoryDto createCategory(CategoryRequest request) {
        Category category = new Category(request.getCategoryName());
        return categoryConverter.convert(categoryRepository.save(category));
    }

    public List<CategoryDto> getAllCategories() {
        return categoryConverter.convert(categoryRepository.findAll());
    }
}