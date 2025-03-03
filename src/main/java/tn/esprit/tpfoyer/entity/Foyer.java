package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.tpfoyer.service.IFoyerService;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor  //Annotation
@NoArgsConstructor
public class Foyer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capacityFoyer;

    @OneToOne(mappedBy = "foyer")
    private Universite universite;

    @ManyToOne
    private Bloc bloc;

}
