package tn.esprit.autoloc_api.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idClient;
    @Column(nullable = false, length = 20)
     String nom;
    @Column(nullable = false, length = 20)
     String prenom;
    @Column(nullable = false, unique = true, length = 20)
     String email;
    @Column(nullable = false, unique = true, length = 20)
     String telephone;
    @Column(nullable = false, unique = true, length = 20)
     String numPermis;
    @Column(nullable = false, length = 20)
     Date dateInscription;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client", cascade = CascadeType.PERSIST)
    List<Reservation> reservations = new ArrayList<Reservation>();
}
