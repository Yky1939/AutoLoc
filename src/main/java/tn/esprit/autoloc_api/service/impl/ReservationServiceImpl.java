package tn.esprit.autoloc_api.service.impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc_api.domain.Reservation;
import tn.esprit.autoloc_api.repository.IReservationRepository;
import tn.esprit.autoloc_api.service.IReservationService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    private final IReservationRepository reservationRepository;

    @Override
    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Reservation introuvable avec l'id " + id));
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }
}