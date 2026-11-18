package tn.esprit.autoloc_api.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc_api.domain.Paiement;
import tn.esprit.autoloc_api.service.impl.PaiementServiceImpl;

import java.util.List;

@Tag(name = "Paiements", description = "Ressource paiement")

@RestController
@RequestMapping("paiements")
@RequiredArgsConstructor
public class PaiementRestController {
    private final PaiementServiceImpl paiementServiceImpl;

    @Operation(summary = "ajoute Paiement")
    @PostMapping
    public Paiement createPaiement(@RequestBody Paiement paiement) {
        return paiementServiceImpl.createPaiement(paiement);
    }

    @GetMapping("/{id}")
    public Paiement getPaiementById(@PathVariable Long id) {
        return paiementServiceImpl.getPaiementById(id);
    }

    @PutMapping
    public Paiement updatePaiement(@RequestBody Paiement paiement) {
        return paiementServiceImpl.updatePaiement(paiement);
    }

    @DeleteMapping("/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementServiceImpl.deletePaiement(id);
    }

    @GetMapping
    public List<Paiement> getAllPaiement() {
        return paiementServiceImpl.getAllPaiement();
    }
}