package com.example.client.controllers;

import com.example.client.entities.Client;
import com.example.client.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Contrôleur REST pour la gestion des clients
 * Expose les endpoints API pour les opérations CRUD sur les clients
 * @author Ilyas MICHICH
 * @version 1.0
 */
@RestController
@RequestMapping("api/client")
public class ClientController {
    @Autowired
    private ClientService service;

    /**
     * Récupère la liste de tous les clients
     * @return Liste de tous les clients
     */
    @GetMapping
    public List<Client> findAll() {
        return service.findAll();
    }

    /**
     * Recherche un client par son identifiant
     * @param id Identifiant du client
     * @return Le client correspondant à l'identifiant
     * @throws Exception Si le client n'existe pas
     */
    @GetMapping("/{id}")
    public Client findById(@PathVariable Long id) throws Exception {
        return service.findById(id);
    }

    /**
     * Enregistre un nouveau client
     * @param client Le client à enregistrer
     */
    @PostMapping
    public void save(@RequestBody Client client) {
        service.addClient(client);
    }
}