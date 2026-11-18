package tn.esprit.autoloc_api.service;



import tn.esprit.autoloc_api.domain.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation createReservation(Reservation reservation);

    Reservation getReservationById(Long id);

    Reservation updateReservation(Reservation reservation);

    void deleteReservation(Long id);

    List<Reservation> getAllReservation();
}