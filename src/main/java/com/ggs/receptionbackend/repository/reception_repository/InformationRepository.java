package com.ggs.receptionbackend.repository.reception_repository;

import com.ggs.receptionbackend.entity.reception_information.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationRepository extends JpaRepository<Information, Long> {
    Information findByCompany_CompanyId(Long companyId);
}
