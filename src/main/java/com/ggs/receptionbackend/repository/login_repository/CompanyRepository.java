package com.ggs.receptionbackend.repository.login_repository;

import com.ggs.receptionbackend.entity.login.rols.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
//    <T> T findEnterpriseByPhoneNumber (int phoneNumber, Class<T> type);
    List<Company> findByCategoriesCategoryId (Long categoryId);
}
