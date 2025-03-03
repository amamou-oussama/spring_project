package tn.esprit.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.service.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {
    @Autowired
    IFoyerService foyerService;

    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getFoyers() {
        List<Foyer> foyers = foyerService.retrieveAllFoyers();
        return foyers;
    }

    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long chId) {
        Foyer foyer = foyerService.retrieveFoyer(chId);
        return foyer;
    }

    @PostMapping("/add-foyer")
    public Foyer addChambre(@RequestBody Foyer c) {
        Foyer foyer = foyerService.addFoyer(c);
        return foyer;
    }

    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long chId) {
        foyerService.removeFoyer(chId);
    }

    @PutMapping("/update-foyer")
    public Foyer updateFoyer(@RequestBody Foyer c) {
        Foyer foyer = foyerService.updateFoyer(c);
        return foyer;
    }

}