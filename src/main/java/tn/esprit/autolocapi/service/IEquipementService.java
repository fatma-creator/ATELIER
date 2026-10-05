package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Equipement;

import java.util.List;

public interface IEquipementService {

    Equipement addEquipement(Equipement equipement);

    Equipement updateEquipement(Equipement equipement);

    Equipement getEquipementById(Long id);

    List<Equipement> getAllEquipements();

    void deleteEquipement(Long id);
}
