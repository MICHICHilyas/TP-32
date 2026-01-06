package com.example.car.models;

import com.example.car.entities.Client;

/**
 * Modèle de réponse pour les voitures incluant les informations du client
 * Utilisé pour retourner les données enrichies au client
 * @author Ilyas MICHICH
 * @version 1.0
 */
public class CarResponse {
    private Long id;
    private String brand;
    private String model;
    private String matricule;
    private Client client;

    /**
     * Constructeur par défaut
     */
    public CarResponse() {}

    /**
     * Constructeur avec tous les paramètres
     * @param id Identifiant de la voiture
     * @param brand Marque de la voiture
     * @param model Modèle de la voiture
     * @param matricule Numéro d'immatriculation
     * @param client Client propriétaire de la voiture
     */
    public CarResponse(Long id, String brand, String model, String matricule, Client client) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.matricule = matricule;
        this.client = client;
    }

    /**
     * Récupère l'identifiant de la voiture
     * @return L'identifiant unique
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit l'identifiant de la voiture
     * @param id Nouvel identifiant
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Récupère la marque de la voiture
     * @return La marque
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Définit la marque de la voiture
     * @param brand Nouvelle marque
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Récupère le modèle de la voiture
     * @return Le modèle
     */
    public String getModel() {
        return model;
    }

    /**
     * Définit le modèle de la voiture
     * @param model Nouveau modèle
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Récupère le numéro d'immatriculation
     * @return Le matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * Définit le numéro d'immatriculation
     * @param matricule Nouveau matricule
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * Récupère le client propriétaire
     * @return Le client
     */
    public Client getClient() {
        return client;
    }

    /**
     * Définit le client propriétaire
     * @param client Nouveau client
     */
    public void setClient(Client client) {
        this.client = client;
    }
}