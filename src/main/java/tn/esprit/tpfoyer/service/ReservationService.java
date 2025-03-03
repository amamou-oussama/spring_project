package tn.esprit.tpfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.repository.IReservationRepository;

import java.util.List;

@Service
public class ReservationService implements IReservationService{
    @Autowired
    IReservationRepository iReservationRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return (List<Reservation>) iReservationRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation c) {
        return iReservationRepository.save(c);
    }

    @Override
    public void removeReservation(String idReservation) {
        iReservationRepository.deleteById(Long.valueOf(idReservation));
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return iReservationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return iReservationRepository.findById(Long.valueOf(idReservation)).orElse(null);
    }


}
