package tn.esprit.autoloc_api.service;



import tn.esprit.autoloc_api.domain.Contrat;

import java.util.List;

public interface IContratService {

    Contrat createContrat(Contrat contrat);

    Contrat getContratById(Long id);

    Contrat updateContrat(Contrat contrat);

    void deleteContrat(Long id);

    List<Contrat> getAllContrat();
}