package com.prince.blog.blogappapis.services;

import com.prince.blog.blogappapis.payload.CategoryDto;

import java.util.List;

public interface CategoryRepo {

    //create
    CategoryDto createCategory(CategoryDto categoryDto);

    //update
    CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

    //delete
    void deleteCategory(Integer categoryId);
    //get
    CategoryDto getCategory(Integer categoryId);

    //getAll
    List<CategoryDto> getCategories();
}
