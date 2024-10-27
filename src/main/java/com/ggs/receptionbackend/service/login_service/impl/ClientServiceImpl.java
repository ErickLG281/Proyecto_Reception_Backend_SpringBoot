package com.ggs.receptionbackend.service.login_service.impl;

import com.ggs.receptionbackend.entity.login.Rol;
import com.ggs.receptionbackend.entity.login.User;
import com.ggs.receptionbackend.entity.login.rols.Client;
import com.ggs.receptionbackend.repository.login_repository.ClientRepository;
import com.ggs.receptionbackend.repository.login_repository.RolRepository;
import com.ggs.receptionbackend.service.login_service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Client searchClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client createClient(Client client) {
        Rol rol = rolRepository.findByName("USER");
        client.getUser().setFullName(client.getFirstName() + " " + client.getLastName());
        client.getUser().setRol(rol);
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Long id, Client client) {
        Client newClient = clientRepository.findById(id).orElse(null);
        if (newClient != null) {
            newClient.setFirstName(client.getFirstName());
            newClient.setLastName(client.getLastName());
            newClient.setAddress(client.getAddress());
            newClient.setPhoneNumber(client.getPhoneNumber());
            newClient.getUser().setFullName(client.getFirstName() + " " + client.getLastName());
            return clientRepository.save(newClient);
        }
        return null;
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
