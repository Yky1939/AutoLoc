package tn.esprit.autoloc_api.domain;

import java.util.Date;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "paiement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPaiement;
    @Column(nullable = false)
    Long montant;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    ModePaiement modePaiement;
    @Column(nullable = false)
    Date datePaiement;

    @ManyToOne(fetch = FetchType.LAZY)
    Contrat contrat;
}






