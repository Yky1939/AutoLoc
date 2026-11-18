package tn.esprit.autoloc_api.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "vehicule")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)

public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idVehicule;
    @Column(nullable = false, unique = true, length = 20)
     String immatriculation;
    @Column(nullable = false, length = 50)
     String marque;
    @Column(nullable = false, length = 50)
     String modele;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
     CategorieVehicule categorie;
    @Column(nullable = false, precision = 10, scale = 2)
     BigDecimal tarifJournalier;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
     StatutVehicule statut;

    @ManyToOne(fetch = FetchType.LAZY)
    Agence agence;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "vehicules", cascade = CascadeType.PERSIST)
    Set<Equipement> equipements = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicule", cascade = CascadeType.PERSIST)
    List<Reservation> reservations = new ArrayList<Reservation>();


}
