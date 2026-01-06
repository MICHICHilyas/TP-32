package com.example.client;

import com.example.client.entities.Client;
import com.example.client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Classe principale de l'application Client
 * Point d'entrée du microservice de gestion des clients
 * @author Ilyas MICHICH
 * @version 1.0
 */
@SpringBootApplication
public class ClientApplication {

    /**
     * Méthode principale pour démarrer l'application Spring Boot
     * @param args Arguments de la ligne de commande
     */
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    /**
     * Initialise la base de données H2 avec des données de test
     * @param clientRepository Repository pour accéder aux données des clients
     * @return CommandLineRunner qui s'exécute au démarrage de l'application
     */
    @Bean
    CommandLineRunner initializeH2Database(ClientRepository clientRepository) {
        return args -> {
            // Ajout de clients de test dans la base de données
            clientRepository.save(new Client(null, "Amine SAFI", Float.parseFloat("23")));
            clientRepository.save(new Client(null, "Amal ALAOUI", Float.parseFloat("22")));
            clientRepository.save(new Client(null, "Samir RAMI", Float.parseFloat("22")));
        };
    }
}
