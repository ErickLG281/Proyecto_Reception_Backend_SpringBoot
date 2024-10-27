package com.ggs.receptionbackend.controller.reception;

import com.ggs.receptionbackend.entity.reception_information.Category;
import com.ggs.receptionbackend.service.reception_service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
@CrossOrigin("http://localhost:5173")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @GetMapping("/get")
    public ResponseEntity<List<Category>> searchCategories() {
        return ResponseEntity.ok(categoryService.searchCategories());
    }

    @PostMapping("/create")
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        Category createdCategory = categoryService.createCategory(category);
        return ResponseEntity.ok(createdCategory);
    }

    @PutMapping("/update/{categoryId}")
    public ResponseEntity<Category> updateCategory(@PathVariable(name = "categoryId") Long id, @RequestBody Category updatedCategory){
        Category updateCategory = categoryService.updateCategory(id, updatedCategory);
        if (updateCategory != null) {
            return ResponseEntity.ok(updateCategory);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{categoryId}")
    public ResponseEntity<Void> deleteCategory(@PathVariable(name = "categoryId") Long id){
        categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }


}
