package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Employe;

import java.util.List;

public interface IEmployeService {

    Employe addEmploye(Employe employe);

    List<Employe> addEmployes(List<Employe> employes);

    Employe updateEmploye(Employe employe);

    Employe retrieveEmploye(long id);

    List<Employe> retrieveAllEmployes();

    void removeEmploye(long id);
}
