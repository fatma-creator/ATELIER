package tn.esprit.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Agence;
import tn.esprit.autolocapi.service.IAgenceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Agence")
public class AgenceController {

    private final IAgenceService ia;

    @PostMapping("/addAgence")
    public Agence addAgence(@RequestBody Agence a) {
        return ia.addAgence(a);
    }

    @GetMapping("/getAgences")
    public List<Agence> getAllAgences() {
        return ia.retrieveAllAgences();
    }

    @GetMapping("/getAgenceId/{ida}")
    public Agence getAgenceById(@PathVariable long ida) {
        return ia.retrieveAgence(ida);
    }

    @DeleteMapping("/deleteAgence/{idaa}")
    public void deleteAgence(@PathVariable long idaa) {
        ia.removeAgence(idaa);
    }

    @PutMapping("/updateAgence")
    public Agence updateAgence(@RequestBody Agence a) {
        return ia.updateAgence(a);
    }
}
