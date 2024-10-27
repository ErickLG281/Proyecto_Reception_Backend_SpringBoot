package com.ggs.receptionbackend.repository.login_repository;

import com.ggs.receptionbackend.entity.login.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByEmailAndPassword(String email, String password);
}
