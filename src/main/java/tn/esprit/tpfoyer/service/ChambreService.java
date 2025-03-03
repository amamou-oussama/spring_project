package tn.esprit.tpfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.repository.IChambreRepository;

import java.util.List;

@Service
public class ChambreService implements IChambreService {
    @Autowired
    IChambreRepository iChambreRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return (List<Chambre>) iChambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return iChambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return iChambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return iChambreRepository.findById(idChambre).orElse(null);
    }
}
