package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Equipement;
import tn.esprit.autolocapi.repository.EquipementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementService implements IEquipementService {

    private final EquipementRepository equipementRepository;

    @Override
    public Equipement addEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement updateEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement getEquipementById(Long id) {
        return equipementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Equipement> getAllEquipements() {
        return equipementRepository.findAll();
    }

    @Override
    public void deleteEquipement(Long id) {
        equipementRepository.deleteById(id);
    }
}
