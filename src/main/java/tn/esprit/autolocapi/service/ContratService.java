package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Contrat;
import tn.esprit.autolocapi.repository.ContratRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {

    private final ContratRepository contratRepository;

    @Override
    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat getContratById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);
    }
}
