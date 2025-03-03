package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.tpfoyer.repository.IBlocRepository;
import tn.esprit.tpfoyer.service.IBlocService;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
    private String nomBloc;
    private long capacityBloc;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    private Set<Foyer> Foyers;

}
