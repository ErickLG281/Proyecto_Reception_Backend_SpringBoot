package com.ggs.receptionbackend.repository.login_test;

import com.ggs.receptionbackend.entity.login.Rol;
import com.ggs.receptionbackend.entity.login.User;
import com.ggs.receptionbackend.repository.login_repository.RolRepository;
import com.ggs.receptionbackend.repository.login_repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RolRepository rolRepository;

    @Test
    public void saveRol(){
        List<Rol> roles = new ArrayList<>();

        Rol userRol = Rol.builder()
                .name("USER")
                .build();
        roles.add(userRol);

        Rol enterpriseRol = Rol.builder()
                .name("COMPANY")
                .build();
        roles.add(enterpriseRol);

        rolRepository.saveAll(roles);
    }

    @Test
    public void saveUser(){
        Rol rol = rolRepository.findByName("ENTERPRISE");

        User user = User.builder()
                .fullName("Julio")
                .email("Julio@gmail.com")
                .password("234245tghdfgfd")
                .rol(rol)
                .build();

        userRepository.save(user);

        rol = rolRepository.findByName("USER");

        user = User.builder()
                .fullName("Juan")
                .email("Juan@gmail.com")
                .password("234245tghdfgfd")
                .rol(rol)
                .build();

        userRepository.save(user);
    }
}
