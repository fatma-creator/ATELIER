package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Employe;

import java.util.List;

public interface IEmployeService {

    Employe addEmploye(Employe employe);

    Employe updateEmploye(Employe employe);

    Employe getEmployeById(Long id);

    List<Employe> getAllEmployes();

    void deleteEmploye(Long id);
}
