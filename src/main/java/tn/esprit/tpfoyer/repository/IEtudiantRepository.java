package tn.esprit.tpfoyer.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tpfoyer.entity.Etudiant;

public interface IEtudiantRepository extends CrudRepository<Etudiant, Long> {

}
