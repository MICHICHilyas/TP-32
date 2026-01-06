package com.server.servereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Classe principale du serveur Eureka
 * Serveur de découverte de services pour l'architecture microservices
 * @author Ilyas MICHICH
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerEurekaApplication {

    /**
     * Méthode principale pour démarrer le serveur Eureka
     * @param args Arguments de la ligne de commande
     */
    public static void main(String[] args) {
        SpringApplication.run(ServerEurekaApplication.class, args);
    }

}
