package com.fateway.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;

/**
 * Classe principale de l'application Gateway
 * Point d'entrée du microservice passerelle API Gateway
 * @author Ilyas MICHICH
 * @version 1.0
 */
@SpringBootApplication
public class GatewayApplication {

    /**
     * Méthode principale pour démarrer l'application Spring Boot
     * @param args Arguments de la ligne de commande
     */
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    /**
     * Configure le routage dynamique basé sur la découverte de services Eureka
     * Permet de router automatiquement les requêtes vers les microservices enregistrés
     * @param reactiveDiscoveryClient Client de découverte réactif
     * @param discoveryLocatorProperties Propriétés de configuration du localisateur
     * @return Localisateur de définitions de routes basé sur la découverte
     */
    @Bean
    DiscoveryClientRouteDefinitionLocator routesDynamic(
            ReactiveDiscoveryClient reactiveDiscoveryClient,
            DiscoveryLocatorProperties discoveryLocatorProperties){
        return new DiscoveryClientRouteDefinitionLocator(reactiveDiscoveryClient,discoveryLocatorProperties);
    }
}