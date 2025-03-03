package tn.esprit.tpfoyer.service;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tpfoyer.entity.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservation();
    public Reservation updateReservation (Reservation res);
    public Reservation retrieveReservation (String idReservation);

    public Reservation addReservation(Reservation c);
    public void removeReservation(String idReservation);
}
