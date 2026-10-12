package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation addReservation(Reservation reservation);

    List<Reservation> addReservations(List<Reservation> reservations);

    Reservation updateReservation(Reservation reservation);

    Reservation retrieveReservation(long id);

    List<Reservation> retrieveAllReservations();

    void removeReservation(long id);
}
