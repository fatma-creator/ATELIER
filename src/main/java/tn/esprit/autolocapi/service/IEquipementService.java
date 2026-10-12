package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Equipement;

import java.util.List;

public interface IEquipementService {

    Equipement addEquipement(Equipement equipement);

    List<Equipement> addEquipements(List<Equipement> equipements);

    Equipement updateEquipement(Equipement equipement);

    Equipement retrieveEquipement(long id);

    List<Equipement> retrieveAllEquipements();

    void removeEquipement(long id);
}
