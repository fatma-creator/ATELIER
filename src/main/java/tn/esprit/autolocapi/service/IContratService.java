package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Contrat;

import java.util.List;

public interface IContratService {

    Contrat addContrat(Contrat contrat);

    Contrat updateContrat(Contrat contrat);

    Contrat getContratById(Long id);

    List<Contrat> getAllContrats();

    void deleteContrat(Long id);
}
