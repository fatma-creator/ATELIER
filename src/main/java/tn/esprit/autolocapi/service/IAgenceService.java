package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Agence;

import java.util.List;

public interface IAgenceService {

    Agence addAgence(Agence agence);

    List<Agence> addAgences(List<Agence> agences);

    Agence updateAgence(Agence agence);

    Agence retrieveAgence(long id);

    List<Agence> retrieveAllAgences();

    void removeAgence(long id);
}
