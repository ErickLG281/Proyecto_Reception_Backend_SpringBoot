package com.ggs.receptionbackend.repository.login_repository;

import com.ggs.receptionbackend.entity.login.rols.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
