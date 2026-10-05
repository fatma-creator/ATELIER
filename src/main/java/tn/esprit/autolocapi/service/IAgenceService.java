package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Agence;

import java.util.List;

public interface IAgenceService {

    Agence addAgence(Agence agence);

    Agence updateAgence(Agence agence);

    Agence getAgenceById(Long id);

    List<Agence> getAllAgences();

    void deleteAgence(Long id);
}
