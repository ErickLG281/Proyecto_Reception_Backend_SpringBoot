package com.ggs.receptionbackend.service.login_service;

import com.ggs.receptionbackend.entity.login.rols.Client;

public interface ClientService {
    Client searchClientById(Long id);
    Client createClient(Client client);
    Client updateClient(Long id, Client client);
    void deleteClient(Long id);
}
