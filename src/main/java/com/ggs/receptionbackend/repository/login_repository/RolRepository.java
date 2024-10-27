package com.ggs.receptionbackend.repository.login_repository;

import com.ggs.receptionbackend.entity.login.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    Rol findByName(String name);
}
