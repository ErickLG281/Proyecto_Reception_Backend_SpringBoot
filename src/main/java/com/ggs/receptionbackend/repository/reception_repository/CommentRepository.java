package com.ggs.receptionbackend.repository.reception_repository;

import com.ggs.receptionbackend.entity.reception_information.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByCompany_CompanyId(Long companyId);

    List<Comment> findByClientClientId(Long clientId);
}
