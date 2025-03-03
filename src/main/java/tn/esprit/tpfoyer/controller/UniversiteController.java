package tn.esprit.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.repository.IUniversiteRepository;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.service.IUniversiteService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {
    @Autowired
    IUniversiteService universiteService;
    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        List<Universite> universites = universiteService.retrieveAllUniversities();
        return universites;
    }
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long chId) {
        Universite universite = universiteService.retrieveUniversite(chId);
        return universite;
    }
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite c) {
        Universite universite = universiteService.addUniversite(c);
        return universite;
    }
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long chId) {
        universiteService.removeUniversite(chId);
    }
    @PutMapping("/update-universite")
    public Universite updateUniversite(@RequestBody Universite c) {
        Universite universite = universiteService.updateUniversite(c);
        return universite;
    }
}
