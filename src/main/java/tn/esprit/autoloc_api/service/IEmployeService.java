package tn.esprit.autoloc_api.service;


import tn.esprit.autoloc_api.domain.Employe;

import java.util.List;

public interface IEmployeService {

    Employe createEmploye(Employe employe);

    Employe getEmployeById(Long id);

    Employe updateEmploye(Employe employe);

    void deleteEmploye(Long id);

    List<Employe> getAllEmploye();
}