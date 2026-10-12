package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {

    Maintenance addMaintenance(Maintenance maintenance);

    List<Maintenance> addMaintenances(List<Maintenance> maintenances);

    Maintenance updateMaintenance(Maintenance maintenance);

    Maintenance retrieveMaintenance(long id);

    List<Maintenance> retrieveAllMaintenances();

    void removeMaintenance(long id);
}
