package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Contrat;

import java.util.List;

public interface IContratService {

    Contrat addContrat(Contrat contrat);

    List<Contrat> addContrats(List<Contrat> contrats);

    Contrat updateContrat(Contrat contrat);

    Contrat retrieveContrat(long id);

    List<Contrat> retrieveAllContrats();

    void removeContrat(long id);
}
