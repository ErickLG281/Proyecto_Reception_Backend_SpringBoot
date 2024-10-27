package com.ggs.receptionbackend.repository.reception_repository;

import com.ggs.receptionbackend.entity.reception_information.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {
    Status findByCompany_CompanyId(Long companyId);

    Status findByClient_ClientId(Long clientId);
}
