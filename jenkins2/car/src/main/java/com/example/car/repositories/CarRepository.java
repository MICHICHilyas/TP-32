package com.example.car.repositories;

import com.example.car.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository pour la gestion des opérations CRUD sur les voitures
 * Hérite de JpaRepository pour bénéficier des méthodes de base
 * @author Ilyas MICHICH
 * @version 1.0
 */
@Repository
public interface CarRepository extends JpaRepository<Car,Long> { }