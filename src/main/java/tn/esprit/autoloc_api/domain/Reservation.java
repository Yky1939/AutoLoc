package tn.esprit.autoloc_api.domain;

import java.util.Date;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Entity
@Table(name = "reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)


public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idReservation;
    @Column(nullable = false)
     Date dateDebut;
    @Column(nullable = false)
     Date dateFin;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
     StatutReservation statut;

    @ManyToOne(fetch = FetchType.LAZY)
    Vehicule vehicule;

    @ManyToOne(fetch = FetchType.LAZY)
    Client client;

    @OneToOne(mappedBy = "reservation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Contrat contrat;

}









