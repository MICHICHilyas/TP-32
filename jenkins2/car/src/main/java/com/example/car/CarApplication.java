package com.example.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Classe principale de l'application Car
 * Point d'entrée du microservice de gestion des voitures
 * @author Ilyas MICHICH
 * @version 1.0
 */
@SpringBootApplication
public class CarApplication {

    /**
     * Méthode principale pour démarrer l'application Spring Boot
     * @param args Arguments de la ligne de commande
     */
    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);
    }

    /**
     * Configure le bean RestTemplate pour les appels HTTP inter-services
     * Définit les timeouts de connexion et de lecture à 5 secondes
     * @return Instance configurée de RestTemplate
     */
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        // Configuration des timeouts pour éviter les blocages
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(5000);
        requestFactory.setReadTimeout(5000);
        restTemplate.setRequestFactory(requestFactory);

        return restTemplate;
    }
}
