package tn.esprit.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    IReservationService reservationService;

    @GetMapping("/retrieve-all-reservation")
    public List<Reservation> getReservations() {
        List<Reservation> reservations = reservationService.retrieveAllReservation();
        return reservations;
    }

    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") String chId) {
        Reservation reservation = reservationService.retrieveReservation(chId);
        return reservation;
    }

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation c) {
        Reservation reservation = reservationService.addReservation(c);
        return reservation;
    }

    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") String chId) {
        reservationService.removeReservation(chId);
    }

    @PutMapping("/update-reservation")
    public Reservation updateReservation(@RequestBody Reservation c) {
        Reservation reservation = reservationService.updateReservation(c);
        return reservation;
    }

}