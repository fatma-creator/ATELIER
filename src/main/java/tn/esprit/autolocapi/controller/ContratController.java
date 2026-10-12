package tn.esprit.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Contrat;
import tn.esprit.autolocapi.service.IContratService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Contrat")
public class ContratController {

    private final IContratService ico;

    @PostMapping("/addContrat")
    public Contrat addContrat(@RequestBody Contrat c) {
        return ico.addContrat(c);
    }

    @GetMapping("/getContrats")
    public List<Contrat> getAllContrats() {
        return ico.retrieveAllContrats();
    }

    @GetMapping("/getContratId/{idco}")
    public Contrat getContratById(@PathVariable long idco) {
        return ico.retrieveContrat(idco);
    }

    @DeleteMapping("/deleteContrat/{idcoo}")
    public void deleteContrat(@PathVariable long idcoo) {
        ico.removeContrat(idcoo);
    }

    @PutMapping("/updateContrat")
    public Contrat updateContrat(@RequestBody Contrat c) {
        return ico.updateContrat(c);
    }
}
