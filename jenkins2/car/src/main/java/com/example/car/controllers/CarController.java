package com.example.car.controllers;

import com.example.car.models.CarResponse;
import com.example.car.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Contrôleur REST pour la gestion des voitures
 * Expose les endpoints API pour les opérations sur les voitures
 * @author Ilyas MICHICH
 * @version 1.0
 */
@RestController
@RequestMapping("api/car")
public class CarController {
    @Autowired
    private CarService carService;

    /**
     * Récupère la liste de toutes les voitures avec leurs clients
     * @return Liste de toutes les voitures
     */
    @GetMapping
    public List<CarResponse> findAll() {
        return carService.findAll();
    }

    /**
     * Recherche une voiture par son identifiant
     * @param id Identifiant de la voiture
     * @return La voiture correspondante avec les informations du client
     * @throws Exception Si la voiture n'existe pas
     */
    @GetMapping("/{id}")
    public CarResponse findById(@PathVariable Long id) throws Exception {
        return carService.findById(id);
    }
}