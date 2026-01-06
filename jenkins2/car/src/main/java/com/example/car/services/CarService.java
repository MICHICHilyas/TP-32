package com.example.car.services;

import com.example.car.entities.Car;
import com.example.car.entities.Client;
import com.example.car.models.CarResponse;
import com.example.car.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Service métier pour la gestion des voitures
 * Gère la logique métier et la communication avec le service Client
 * @author Ilyas MICHICH
 * @version 1.0
 */
@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private RestTemplate restTemplate;
    
    // URL du service Client via la gateway
    private final String URL = "http://localhost:8888/SERVICE-CLIENT";

    /**
     * Récupère toutes les voitures avec les informations des clients associés
     * @return Liste de toutes les voitures avec leurs clients
     */
    public List<CarResponse> findAll() {
        // Récupération de toutes les voitures depuis la base de données
        List<Car> cars = carRepository.findAll();
        // Appel au service Client pour récupérer tous les clients
        ResponseEntity<Client[]> response = restTemplate.getForEntity(this.URL + "/api/client", Client[].class);
        Client[] clients = response.getBody();
        // Transformation des entités Car en CarResponse avec les clients associés
        return cars.stream().map((Car car) -> mapToCarResponse(car, clients)).toList();
    }

    /**
     * Transforme une entité Car en CarResponse avec le client associé
     * @param car L'entité voiture à transformer
     * @param clients Tableau des clients disponibles
     * @return CarResponse avec les informations du client
     */
    private CarResponse mapToCarResponse(Car car, Client[] clients) {
        // Recherche du client correspondant à la voiture
        Client foundClient = Arrays.stream(clients)
                .filter(client -> client.getId().equals(car.getClient_id()))
                .findFirst()
                .orElse(null);

        return new CarResponse(car.getId(), car.getBrand(), car.getModel(), car.getMatricule(), foundClient);
    }


    /**
     * Recherche une voiture par son identifiant avec les informations du client
     * @param id Identifiant de la voiture à rechercher
     * @return CarResponse avec les détails de la voiture et du client
     * @throws Exception Si la voiture n'existe pas
     */
    public CarResponse findById(Long id) throws Exception {
        // Récupération de la voiture depuis la base de données
        Car car = carRepository.findById(id).orElseThrow(() -> new Exception("Invalid Car Id"));
        // Appel au service Client pour récupérer le client associé
        Client client = restTemplate.getForObject(this.URL + "/api/client/" + car.getClient_id(), Client.class);
        return new CarResponse(car.getId(), car.getBrand(), car.getModel(), car.getMatricule(), client);
    }
}
