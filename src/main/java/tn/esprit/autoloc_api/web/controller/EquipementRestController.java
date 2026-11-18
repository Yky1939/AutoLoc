package tn.esprit.autoloc_api.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc_api.domain.Equipement;
import tn.esprit.autoloc_api.service.impl.EquipementServiceImpl;

import java.util.List;

@Tag(name = "Equipements", description = "Ressource equipement")

@RestController
@RequestMapping("equipements")
@RequiredArgsConstructor
public class EquipementRestController {
    private final EquipementServiceImpl equipementServiceImpl;

    @Operation(summary = "ajoute Equipement")
    @PostMapping
    public Equipement createEquipement(@RequestBody Equipement equipement) {
        return equipementServiceImpl.createEquipement(equipement);
    }

    @GetMapping("/{id}")
    public Equipement getEquipementById(@PathVariable Long id) {
        return equipementServiceImpl.getEquipementById(id);
    }

    @PutMapping
    public Equipement updateEquipement(@RequestBody Equipement equipement) {
        return equipementServiceImpl.updateEquipement(equipement);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementServiceImpl.deleteEquipement(id);
    }

    @GetMapping
    public List<Equipement> getAllEquipement() {
        return equipementServiceImpl.getAllEquipement();
    }
}