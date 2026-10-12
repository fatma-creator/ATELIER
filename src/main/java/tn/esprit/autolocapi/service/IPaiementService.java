package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Paiement;

import java.util.List;

public interface IPaiementService {

    Paiement addPaiement(Paiement paiement);

    List<Paiement> addPaiements(List<Paiement> paiements);

    Paiement updatePaiement(Paiement paiement);

    Paiement retrievePaiement(long id);

    List<Paiement> retrieveAllPaiements();

    void removePaiement(long id);
}
