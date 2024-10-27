package com.ggs.receptionbackend.repository.reception_repository;

import com.ggs.receptionbackend.entity.reception_information.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImagesRepository extends JpaRepository<Images,Long> {
    List<Images> findByCompany_CompanyId(Long companyId);
}
