package tn.esprit.autoloc_api.domain;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Entity
@Table(name = "employe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idEmploye;
    @Column(nullable = false, length = 20)
     String nom;
    @Column(nullable = false, length = 20)
     String prenom;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
     RoleEmploye role;

    @ManyToOne(fetch = FetchType.LAZY)
    Agence agence;

    
    
}
