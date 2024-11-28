package com.ggs.receptionbackend.repository.login_test;

import com.ggs.receptionbackend.entity.login.User;
import com.ggs.receptionbackend.entity.login.rols.Company;
import com.ggs.receptionbackend.repository.login_repository.CompanyRepository;
import com.ggs.receptionbackend.repository.login_repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompanyRepositoryTest {

   /* @Autowired
    private CompanyRepository enterpriseRepository;

    @Autowired
    private UserRepository userRepository;
    @Test
    public void saveEnterprise(){
        User user = userRepository.findById(3L).orElse(null);

        Company enterprise = Company.builder()
                .name("Los Portales")
                .location("Tarma")
                .email("portales@test.com")
                .phoneNumber(987456321)
                .user(user)
                .build();

        enterpriseRepository.save(enterprise);
    }

    */
}
