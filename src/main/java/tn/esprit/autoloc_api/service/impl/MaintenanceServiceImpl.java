package tn.esprit.autoloc_api.service.impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc_api.domain.Maintenance;
import tn.esprit.autoloc_api.repository.IMaintenanceRepository;
import tn.esprit.autoloc_api.service.IMaintenanceService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceService {

    private final IMaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance createMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance getMaintenanceById(Long id) {
        return maintenanceRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Maintenance introuvable avec l'id " + id));
    }

    @Override
    public Maintenance updateMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void deleteMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public List<Maintenance> getAllMaintenance() {
        return maintenanceRepository.findAll();
    }
}