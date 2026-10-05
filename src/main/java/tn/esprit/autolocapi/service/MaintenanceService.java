package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Maintenance;
import tn.esprit.autolocapi.repository.MaintenanceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceService implements IMaintenanceService {

    private final MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance addMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance getMaintenanceById(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Maintenance> getAllMaintenances() {
        return maintenanceRepository.findAll();
    }

    @Override
    public void deleteMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }
}
