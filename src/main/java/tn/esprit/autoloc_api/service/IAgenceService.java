package tn.esprit.autoloc_api.service;



import tn.esprit.autoloc_api.domain.Agence;

import java.util.List;

public interface IAgenceService {

    Agence createAgence(Agence agence);

    Agence getAgenceById(Long id);

    Agence updateAgence(Agence agence);

    void deleteAgence(Long id);

    List<Agence> getAllAgence();
}