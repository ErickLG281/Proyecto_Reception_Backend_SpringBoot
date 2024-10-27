package com.ggs.receptionbackend.service.reception_service.impl;

import com.ggs.receptionbackend.entity.reception_information.Category;
import com.ggs.receptionbackend.repository.reception_repository.CategoryRepository;
import com.ggs.receptionbackend.service.reception_service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> searchCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category searchCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category createCategory(Category category) {
        category.setName(category.getName());
        category.setImgUrl(category.getImgUrl());
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Long id, Category category) {
        Category newCategory = categoryRepository.findById(id).orElse(null);
        if (newCategory != null) {
            newCategory.setName(category.getName());
            newCategory.setImgUrl(category.getImgUrl());
            return categoryRepository.save(newCategory);
        }
        return null;
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
