package tn.esprit.autoloc_api.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc_api.domain.Reservation;
import tn.esprit.autoloc_api.service.impl.ReservationServiceImpl;

import java.util.List;

@Tag(name = "Reservations", description = "Ressource reservation")

@RestController
@RequestMapping("reservations")
@RequiredArgsConstructor
public class ReservationRestController {
    private final ReservationServiceImpl reservationServiceImpl;

    @Operation(summary = "ajoute Reservation")
    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationServiceImpl.createReservation(reservation);
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
        return reservationServiceImpl.getReservationById(id);
    }

    @PutMapping
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationServiceImpl.updateReservation(reservation);
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationServiceImpl.deleteReservation(id);
    }

    @GetMapping
    public List<Reservation> getAllReservation() {
        return reservationServiceImpl.getAllReservation();
    }
}