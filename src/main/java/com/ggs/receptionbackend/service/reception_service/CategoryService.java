package com.ggs.receptionbackend.service.reception_service;

import com.ggs.receptionbackend.entity.reception_information.Category;

import java.util.List;

public interface CategoryService {
    List<Category> searchCategories();
    Category searchCategoryById(Long id);
    Category createCategory(Category category);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
}
