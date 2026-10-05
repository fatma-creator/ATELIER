package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Paiement;

import java.util.List;

public interface IPaiementService {

    Paiement addPaiement(Paiement paiement);

    Paiement updatePaiement(Paiement paiement);

    Paiement getPaiementById(Long id);

    List<Paiement> getAllPaiements();

    void deletePaiement(Long id);
}
