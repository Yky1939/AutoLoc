package tn.esprit.autoloc_api.service.impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc_api.domain.Employe;
import tn.esprit.autoloc_api.repository.IEmployeRepository;
import tn.esprit.autoloc_api.service.IEmployeService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpl implements IEmployeService {

    private final IEmployeRepository employeRepository;

    @Override
    public Employe createEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe getEmployeById(Long id) {
        return employeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employe introuvable avec l'id " + id));
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public List<Employe> getAllEmploye() {
        return employeRepository.findAll();
    }
}