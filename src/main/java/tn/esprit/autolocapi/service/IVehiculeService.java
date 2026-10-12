package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {

    Vehicule addVehicule(Vehicule vehicule);

    List<Vehicule> addVehicules(List<Vehicule> vehicules);

    Vehicule updateVehicule(Vehicule vehicule);

    Vehicule retrieveVehicule(long id);

    List<Vehicule> retrieveAllVehicules();

    void removeVehicule(long id);
}
