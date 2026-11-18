package tn.esprit.autoloc_api.service;



import tn.esprit.autoloc_api.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule createVehicule(Vehicule vehicule);
    Vehicule getVehiculeById(Long id);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehicule(Long id );
    List<Vehicule> getAllVehicule();
}
