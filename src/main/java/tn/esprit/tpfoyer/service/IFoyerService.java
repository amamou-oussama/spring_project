package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;

public interface IFoyerService {
    public List<Foyer> retrieveAllFoyers();
    public Foyer addFoyer (Foyer f);
    public Foyer updateFoyer (Foyer f);
    public Foyer retrieveFoyer (long idFoyer);
    void removeFoyer (long idFoyer);

}
