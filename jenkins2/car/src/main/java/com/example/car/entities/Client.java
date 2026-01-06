package com.example.car.entities;

/**
 * Modèle représentant un client récupéré depuis le service Client
 * Utilisé pour la communication inter-services
 * @author Ilyas MICHICH
 * @version 1.0
 */
public class Client {
    private Long id;
    private String nom;
    private Integer age;

    /**
     * Constructeur par défaut
     */
    public Client() {}

    /**
     * Constructeur avec tous les paramètres
     * @param id Identifiant unique du client
     * @param nom Nom du client
     * @param age Age du client
     */
    public Client(Long id, String nom, Integer age) {
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
    public Integer getAge() {
        return age;
    }

    /**
     * Définit l'âge du client
     * @param age Nouvel âge
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}