package com.ggs.receptionbackend.service.login_service;

import com.ggs.receptionbackend.DTO.CompanyDTO;
import com.ggs.receptionbackend.DTO.ReceptionDTO;
import com.ggs.receptionbackend.entity.login.rols.Company;

import java.util.List;

public interface CompanyService {
    List<ReceptionDTO> searchByCategoriesCategoryId(Long categoryId);
    Company searchCompanyById(Long id);
    Company createCompany(CompanyDTO enterprise);
    Company updateCompany(Long id, Company enterprise);
    void deleteCompany(Long id);
}
