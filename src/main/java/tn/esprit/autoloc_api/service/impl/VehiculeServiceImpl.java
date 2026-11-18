package tn.esprit.autoloc_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc_api.domain.Vehicule;
import tn.esprit.autoloc_api.repository.IVehiculeRepository;
import tn.esprit.autoloc_api.service.IVehiculeService;

import java.util.List;
@RequiredArgsConstructor
@Service

public class VehiculeServiceImpl implements IVehiculeService {


    private final IVehiculeRepository vehiculeRepository ;
    @Override
    public Vehicule createVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);

    }

    @Override
    public List<Vehicule> getAllVehicule() {
        return vehiculeRepository.findAll();
    }
}
