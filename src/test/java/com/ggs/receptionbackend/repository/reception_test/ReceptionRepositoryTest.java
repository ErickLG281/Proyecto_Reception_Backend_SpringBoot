package com.ggs.receptionbackend.repository.reception_test;

import com.ggs.receptionbackend.entity.login.rols.Company;
import com.ggs.receptionbackend.entity.reception_information.Category;
import com.ggs.receptionbackend.repository.login_repository.CompanyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ReceptionRepositoryTest {
    @Autowired
    private CompanyRepository companyRepository;

    @Test
    public void saveReceptinWithCategory () {
        Category category = Category.builder()
                .name("category1")
                .imgUrl("http://xd")
                .build();

        Category category2 = Category.builder()
                .name("category2")
                .imgUrl("http://fdsfdsxd")
                .build();

        Company reception = Company.builder()
                .name("Reception")
                .categories(List.of(category, category2))
                .build();
        companyRepository.save(reception);
    }

    @Test
    public void searchAllReceptionsWithCategory() {
        List<Company> receptions = companyRepository.findAll();
        System.out.println("categories: " + receptions);
    }

    @Test
    public void searchCategoryByReception() {
        Company reception = companyRepository.findById(1L).get();
        List<Category> categories = reception.getCategories();
        System.out.println("categories: " + categories);
    }
    @Test
    public void findByCategoriesCategoryId() {
        List<Company> receptions = companyRepository.findByCategoriesCategoryId(1L);
        System.out.println("categories: " + receptions);
    }

}
