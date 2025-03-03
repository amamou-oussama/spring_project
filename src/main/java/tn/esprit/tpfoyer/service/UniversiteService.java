package tn.esprit.tpfoyer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.repository.IUniversiteRepository;

import java.util.List;

@Service
public class UniversiteService implements IUniversiteService {
    @Autowired
    IUniversiteRepository iUniversiteRepository;

    @Override
    public List<Universite> retrieveAllUniversities() {
        return (List<Universite>) iUniversiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return iUniversiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return iUniversiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return iUniversiteRepository.findById(idUniversite).get();
    }

    @Override
    public void removeUniversite(Long chId) {
        iUniversiteRepository.deleteById(chId);
    }
}
