package tn.esprit.tpfoyer.service;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tpfoyer.entity.Chambre;

import java.util.List;

public interface IChambreService  {
    public List<Chambre> retrieveAllChambres();
    public Chambre addChambre(Chambre c);
    public Chambre updateChambre (Chambre c);
    public Chambre retrieveChambre (long idChambre);

}
