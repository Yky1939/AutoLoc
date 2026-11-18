package tn.esprit.autoloc_api.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc_api.domain.Maintenance;
import tn.esprit.autoloc_api.service.impl.MaintenanceServiceImpl;

import java.util.List;

@Tag(name = "Maintenances", description = "Ressource maintenance")

@RestController
@RequestMapping("maintenances")
@RequiredArgsConstructor
public class MaintenanceRestController {
    private final MaintenanceServiceImpl maintenanceServiceImpl;

    @Operation(summary = "ajoute Maintenance")
    @PostMapping
    public Maintenance createMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceServiceImpl.createMaintenance(maintenance);
    }

    @GetMapping("/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id) {
        return maintenanceServiceImpl.getMaintenanceById(id);
    }

    @PutMapping
    public Maintenance updateMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceServiceImpl.updateMaintenance(maintenance);
    }

    @DeleteMapping("/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceServiceImpl.deleteMaintenance(id);
    }

    @GetMapping
    public List<Maintenance> getAllMaintenance() {
        return maintenanceServiceImpl.getAllMaintenance();
    }
}