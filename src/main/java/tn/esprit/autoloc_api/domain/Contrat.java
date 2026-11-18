package tn.esprit.autoloc_api.domain;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "contrat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idContrat;
    @Column(nullable = false)
     Date dateSignature;
    @Column(nullable = false)
     Long montantTotal;
    @Column(nullable = false)
     Boolean valide;

    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    List<Paiement> paiements = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)
    Reservation reservation;
}
