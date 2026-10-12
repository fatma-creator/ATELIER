package tn.esprit.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Equipement;
import tn.esprit.autolocapi.service.IEquipementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Equipement")
public class EquipementController {

    private final IEquipementService ieq;

    @PostMapping("/addEquipement")
    public Equipement addEquipement(@RequestBody Equipement e) {
        return ieq.addEquipement(e);
    }

    @GetMapping("/getEquipements")
    public List<Equipement> getAllEquipements() {
        return ieq.retrieveAllEquipements();
    }

    @GetMapping("/getEquipementId/{ideq}")
    public Equipement getEquipementById(@PathVariable long ideq) {
        return ieq.retrieveEquipement(ideq);
    }

    @DeleteMapping("/deleteEquipement/{ideqq}")
    public void deleteEquipement(@PathVariable long ideqq) {
        ieq.removeEquipement(ideqq);
    }

    @PutMapping("/updateEquipement")
    public Equipement updateEquipement(@RequestBody Equipement e) {
        return ieq.updateEquipement(e);
    }
}
