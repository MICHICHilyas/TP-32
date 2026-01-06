package com.example.car.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entité représentant une voiture dans le système
 * Mappée à la table Car dans la base de données
 * @author Ilyas MICHICH
 * @version 1.0
 */
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String matricule;
    private Long client_id;

    /**
     * Constructeur par défaut requis par JPA
     */
    public Car() {}

    /**
     * Constructeur avec tous les paramètres
     * @param id Identifiant unique de la voiture
     * @param brand Marque de la voiture
     * @param model Modèle de la voiture
     * @param matricule Numéro d'immatriculation
     * @param client_id Identifiant du client propriétaire
     */
    public Car(Long id, String brand, String model, String matricule, Long client_id) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.matricule = matricule;
        this.client_id = client_id;
    }

    /**
     * Récupère l'identifiant de la voiture
     * @return L'identifiant unique de la voiture
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
     * @return La marque de la voiture
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
     * @return Le modèle de la voiture
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
     * @return Le matricule de la voiture
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
     * Récupère l'identifiant du client propriétaire
     * @return L'identifiant du client
     */
    public Long getClient_id() {
        return client_id;
    }

    /**
     * Définit l'identifiant du client propriétaire
     * @param client_id Nouvel identifiant du client
     */
    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }
}