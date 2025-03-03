package tn.esprit.tpfoyer.service;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tpfoyer.entity.Universite;

import java.util.List;

public interface IUniversiteService{
    public List<Universite> retrieveAllUniversities();
    public Universite addUniversite (Universite u);
    public Universite updateUniversite (Universite u);
    public Universite retrieveUniversite (long idUniversite);

    public void removeUniversite(Long chId);
}
