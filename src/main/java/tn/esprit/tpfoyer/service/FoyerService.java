package tn.esprit.tpfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.repository.IFoyerRepository;

import java.util.List;

@Service
public class FoyerService implements IFoyerService{
    @Autowired
    IFoyerRepository iFoyerRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return (List<Foyer>) iFoyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return iFoyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return iFoyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return iFoyerRepository.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(long idFoyer) {
        iFoyerRepository.deleteById(idFoyer);
    }
}
