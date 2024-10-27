package com.ggs.receptionbackend.controller.login;

import com.ggs.receptionbackend.entity.login.rols.Client;
import com.ggs.receptionbackend.service.login_service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/{clientId}")
    public ResponseEntity<Client> searchEnterpriseById (@PathVariable(name = "clientId") Long id) {
        Client client = clientService.searchClientById(id);
        if (client != null) {
            return ResponseEntity.ok(client);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client newClient = clientService.createClient(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(newClient);
    }

    @PutMapping("/update/{clientId}")
    public ResponseEntity<Client> updateClient(@PathVariable(name = "clientId") Long id, @RequestBody Client client){
        Client newClient = clientService.updateClient(id, client);
        if (newClient != null) {
            return ResponseEntity.ok(newClient);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{clientId}")
    public ResponseEntity<Client> deleteEnterprise(@PathVariable(name = "clientId") Long id) {
        clientService.deleteClient(id);
        return ResponseEntity.noContent().build();
    }
}
