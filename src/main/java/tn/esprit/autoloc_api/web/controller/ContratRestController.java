package tn.esprit.autoloc_api.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc_api.domain.Contrat;
import tn.esprit.autoloc_api.service.impl.ContratServiceImpl;

import java.util.List;

@Tag(name = "Contrats", description = "Ressource contrat")

@RestController
@RequestMapping("contrats")
@RequiredArgsConstructor
public class ContratRestController {
    private final ContratServiceImpl contratServiceImpl;

    @Operation(summary = "ajoute Contrat")
    @PostMapping
    public Contrat createContrat(@RequestBody Contrat contrat) {
        return contratServiceImpl.createContrat(contrat);
    }

    @GetMapping("/{id}")
    public Contrat getContratById(@PathVariable Long id) {
        return contratServiceImpl.getContratById(id);
    }

    @PutMapping
    public Contrat updateContrat(@RequestBody Contrat contrat) {
        return contratServiceImpl.updateContrat(contrat);
    }

    @DeleteMapping("/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratServiceImpl.deleteContrat(id);
    }

    @GetMapping
    public List<Contrat> getAllContrat() {
        return contratServiceImpl.getAllContrat();
    }
}