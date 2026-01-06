package com.example.client.services;

import com.example.client.entities.Client;
import com.example.client.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service métier pour la gestion des clients
 * Contient la logique métier liée aux opérations sur les clients
 * @author Ilyas MICHICH
 * @version 1.0
 */
@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    /**
     * Récupère la liste de tous les clients
     * @return Liste de tous les clients en base de données
     */
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    /**
     * Recherche un client par son identifiant
     * @param id Identifiant du client à rechercher
     * @return Le client trouvé
     * @throws Exception Si le client n'existe pas
     */
    public Client findById(Long id) throws Exception {
        return clientRepository.findById(id).orElseThrow(() -> new Exception("Invalid Client ID"));
    }

    /**
     * Ajoute un nouveau client dans la base de données
     * @param client Le client à ajouter
     */
    public void addClient(Client client) {
        clientRepository.save(client);
    }
}
