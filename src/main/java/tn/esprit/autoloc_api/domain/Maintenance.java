package tn.esprit.autoloc_api.domain;

import java.util.Date;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "maintenance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idMaintenance;
    @Column(nullable = false)
     Date dateDebut;
    @Column(nullable = false)
     Date dateFin;
    @Column(nullable = false)
     String Description;

    @ManyToOne(fetch = FetchType.LAZY)
    Vehicule vehicule;


}





