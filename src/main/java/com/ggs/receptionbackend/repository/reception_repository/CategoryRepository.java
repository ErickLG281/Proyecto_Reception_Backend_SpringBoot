package com.ggs.receptionbackend.repository.reception_repository;


import com.ggs.receptionbackend.entity.reception_information.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    Category findByName(String name);
}
