package com.ggs.receptionbackend.service.login_service.impl;
import com.ggs.receptionbackend.DTO.CompanyDTO;
import com.ggs.receptionbackend.DTO.ReceptionDTO;
import com.ggs.receptionbackend.entity.login.Rol;
import com.ggs.receptionbackend.entity.login.User;
import com.ggs.receptionbackend.entity.login.rols.Company;
import com.ggs.receptionbackend.entity.reception_information.Comment;
import com.ggs.receptionbackend.entity.reception_information.Images;
import com.ggs.receptionbackend.entity.reception_information.Information;
import com.ggs.receptionbackend.repository.login_repository.CompanyRepository;
import com.ggs.receptionbackend.repository.login_repository.RolRepository;
import com.ggs.receptionbackend.repository.reception_repository.CommentRepository;
import com.ggs.receptionbackend.repository.reception_repository.ImagesRepository;
import com.ggs.receptionbackend.repository.reception_repository.InformationRepository;
import com.ggs.receptionbackend.service.login_service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private RolRepository rolRepository;

    @Autowired
    private InformationRepository informationRepository;

    @Autowired
    private ImagesRepository imagesRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<ReceptionDTO> searchByCategoriesCategoryId(Long categoryId) {
        List<Company> companies =  companyRepository.findByCategoriesCategoryId(categoryId);
        List<ReceptionDTO> receptionDTOS = new ArrayList<>();

        for (Company company : companies) {
            List<Images> images = imagesRepository.findByCompany_CompanyId(company.getCompanyId());
            Information information = informationRepository.findByCompany_CompanyId(company.getCompanyId());
            List<Comment> comments = commentRepository.findByCompany_CompanyId(company.getCompanyId());

            double ratingAverage = 0.0;

            if (!comments.isEmpty()){
                ratingAverage = Double.parseDouble(String.format("%.1f", getRatingAverage(comments)));
            }

            ReceptionDTO receptionDTO = ReceptionDTO.builder()
                    .name(company.getName())
                    .location(company.getLocation())
                    .phoneNumber(company.getPhoneNumber())
                    .initialPrice(information.getInitialPrice())
                    .maxQuantity(information.getMaxQuantity())
                    .minQuantity(information.getMinQuantity())
                    .description(information.getDescription())
                    .rating(ratingAverage )
                    .images(images)
                    .build();
            receptionDTOS.add(receptionDTO);
        }

        return receptionDTOS;
    }

    private double getRatingAverage(List<Comment> comments) {
        double ratingAdd = 0;
        for (Comment comment: comments){
            int professionalism =  comment.getProfessionalism();
            int flexibility = comment.getFlexibility();
            int qualityService = comment.getQualityService();
            int qualityPrice = comment.getQualityPrice();
            int responseTime = comment.getResponseTime();
            ratingAdd += professionalism + flexibility + qualityPrice + qualityService + responseTime;
        }
        return ratingAdd / (5 * comments.size());
    }

    @Override
    public Company searchCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public Company createCompany(CompanyDTO companyDTO) {
        Rol rol = rolRepository.findByName("COMPANY");

        User user = User.builder()
                .fullName(companyDTO.getFullName())
                .email(companyDTO.getEmailUser())
                .password(companyDTO.getPassword())
                .rol(rol)
                .build();

        Company company = Company.builder()
                .name(companyDTO.getNameCompany())
                .email(companyDTO.getEmailCompany())
                .phoneNumber(companyDTO.getPhoneNumber())
                .user(user)
                .build();

        return companyRepository.save(company);
    }

    @Override
    public Company updateCompany(Long id, Company company) {
        Company newCompany = companyRepository.findById(id).orElse(null);
        if (newCompany != null) {
            newCompany.setName(company.getName());
            newCompany.setLocation(company.getLocation());
            newCompany.setEmail(company.getEmail());
            newCompany.setPhoneNumber(company.getPhoneNumber());
            return companyRepository.save(newCompany);
        }
        return null;
    }

    @Override
    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }
}
