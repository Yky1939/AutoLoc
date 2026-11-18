package tn.esprit.autoloc_api.service.impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc_api.domain.Contrat;
import tn.esprit.autoloc_api.repository.IContratRepository;
import tn.esprit.autoloc_api.service.IContratService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratServiceImpl implements IContratService {

    private final IContratRepository contratRepository;

    @Override
    public Contrat createContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat getContratById(Long id) {
        return contratRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Contrat introuvable avec l'id " + id));
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public List<Contrat> getAllContrat() {
        return contratRepository.findAll();
    }
}