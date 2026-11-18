package tn.esprit.autoloc_api.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc_api.domain.Vehicule;
import tn.esprit.autoloc_api.service.impl.VehiculeServiceImpl;

import java.util.List;
@Tag(name = "Vehicules" ,description = "Ressource vehicule")

@RestController
@RequestMapping("vehicules")
@RequiredArgsConstructor
public class VehiculeRestController{
    private final VehiculeServiceImpl vehiculeServiceImpl;
    @Operation(summary = "ajoute Vehicule")
    @PostMapping
    public Vehicule createVehicule(@RequestBody Vehicule vehicule){
        return vehiculeServiceImpl.createVehicule(vehicule);
    }
    @GetMapping("/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id){
        return vehiculeServiceImpl.getVehiculeById(id);
    }
    @PutMapping
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule){
        return vehiculeServiceImpl.updateVehicule(vehicule);
    }
    @DeleteMapping("/{id}")
    public void deleteVehicule(@PathVariable Long id){
        vehiculeServiceImpl.deleteVehicule(id);
    }
    @GetMapping
    public List<Vehicule> getAllVehicule(){
        return vehiculeServiceImpl.getAllVehicule();
    }


}
