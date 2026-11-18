package tn.esprit.autoloc_api.service;



import tn.esprit.autoloc_api.domain.Paiement;

import java.util.List;

public interface IPaiementService {

    Paiement createPaiement(Paiement paiement);

    Paiement getPaiementById(Long id);

    Paiement updatePaiement(Paiement paiement);

    void deletePaiement(Long id);

    List<Paiement> getAllPaiement();
}