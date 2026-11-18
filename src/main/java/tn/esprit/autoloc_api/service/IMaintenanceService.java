package tn.esprit.autoloc_api.service;



import tn.esprit.autoloc_api.domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {

    Maintenance createMaintenance(Maintenance maintenance);

    Maintenance getMaintenanceById(Long id);

    Maintenance updateMaintenance(Maintenance maintenance);

    void deleteMaintenance(Long id);

    List<Maintenance> getAllMaintenance();
}