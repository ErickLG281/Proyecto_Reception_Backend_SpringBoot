package com.ggs.receptionbackend.repository.login_test;

import com.ggs.receptionbackend.entity.login.rols.Client;
import com.ggs.receptionbackend.entity.login.Rol;
import com.ggs.receptionbackend.entity.login.User;
import com.ggs.receptionbackend.repository.login_repository.ClientRepository;
import com.ggs.receptionbackend.repository.login_repository.RolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ClientRepositoryTest {

   /* @Autowired
    ClientRepository clientRepository;

    @Autowired
    RolRepository rolRepository;
    @Test
    public void saveClient(){
        Rol rol = rolRepository.findByName("USER");

        User user = User.builder()
                .fullName("Marco Porras")
                .email("marco@example.com")
                .password("marocfsjhfsdjk")
                .rol(rol)
                .build();

        Client client = Client.builder()
                .firstName("Marco")
                .lastName("Porras")
                .phoneNumber(874512564)
                .address("18974654 Main")
                .user(user)
                .build();

        clientRepository.save(client);
    }

    @Test
    public void findAllClients(){
        List<Client> clients = clientRepository.findAll();
        System.out.println("People: " + clients);
    }

    @Test
    public void deleteClient(){
        clientRepository.deleteById(5L);
    }

    @Test
    public void searchClientById() {
        clientRepository.findById(6L);
    }

    */
}
