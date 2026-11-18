package tn.esprit.autoloc_api.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc_api.domain.Employe;
import tn.esprit.autoloc_api.service.impl.EmployeServiceImpl;

import java.util.List;

@Tag(name = "Employes", description = "Ressource employe")

@RestController
@RequestMapping("employes")
@RequiredArgsConstructor
public class EmployeRestController {
    private final EmployeServiceImpl employeServiceImpl;

    @Operation(summary = "ajoute Employe")
    @PostMapping
    public Employe createEmploye(@RequestBody Employe employe) {
        return employeServiceImpl.createEmploye(employe);
    }

    @GetMapping("/{id}")
    public Employe getEmployeById(@PathVariable Long id) {
        return employeServiceImpl.getEmployeById(id);
    }

    @PutMapping
    public Employe updateEmploye(@RequestBody Employe employe) {
        return employeServiceImpl.updateEmploye(employe);
    }

    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeServiceImpl.deleteEmploye(id);
    }

    @GetMapping
    public List<Employe> getAllEmploye() {
        return employeServiceImpl.getAllEmploye();
    }
}