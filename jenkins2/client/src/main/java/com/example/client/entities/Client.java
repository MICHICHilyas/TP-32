package com.example.client.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entité représentant un client dans le système
 * Mappée à la table Client dans la base de données
 * @author Ilyas MICHICH
 * @version 1.0
 */
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Float age;

    /**
     * Constructeur par défaut requis par JPA
     */
    public Client() {}

    /**
     * Constructeur avec tous les paramètres
     * @param id Identifiant unique du client
     * @param nom Nom du client
     * @param age Age du client
     */
    public Client(Long id, String nom, Float age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }

    /**
     * Récupère l'identifiant du client
     * @return L'identifiant unique du client
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit l'identifiant du client
     * @param id Nouvel identifiant
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Récupère le nom du client
     * @return Le nom du client
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom du client
     * @param nom Nouveau nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Récupère l'âge du client
     * @return L'âge du client
     */
    public Float getAge() {
        return age;
    }

    /**
     * Définit l'âge du client
     * @param age Nouvel âge
     */
    public void setAge(Float age) {
        this.age = age;
    }
}

