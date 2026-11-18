package tn.esprit.autoloc_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc_api.domain.Contrat;

public interface IContratRepository extends JpaRepository<Contrat,Long> {
}
