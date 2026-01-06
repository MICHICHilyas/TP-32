package com.example.client.repositories;

import com.example.client.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository pour la gestion des opérations CRUD sur les clients
 * Hérite de JpaRepository pour bénéficier des méthodes de base
 * @author Ilyas MICHICH
 * @version 1.0
 */
@Repository
public interface ClientRepository extends JpaRepository<Client,Long> { }