package tn.esprit.autoloc_api.domain;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agence")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idAgence;
    @Column(nullable = false, length = 20)
     String nom;
    @Column(nullable = false, length = 20)
     String ville;
    @Column(nullable = false, length = 20)
     String adresse;
    @Column(nullable = false, length = 20)
     String telephone;

    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    List<Employe> employes = new ArrayList<Employe>();

    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    List<Vehicule> vehicules = new ArrayList<Vehicule>();


}


