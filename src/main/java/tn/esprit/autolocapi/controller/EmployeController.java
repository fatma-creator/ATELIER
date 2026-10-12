package tn.esprit.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Employe;
import tn.esprit.autolocapi.service.IEmployeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Employe")
public class EmployeController {

    private final IEmployeService ie;

    @PostMapping("/addEmploye")
    public Employe addEmploye(@RequestBody Employe e) {
        return ie.addEmploye(e);
    }

    @GetMapping("/getEmployes")
    public List<Employe> getAllEmployes() {
        return ie.retrieveAllEmployes();
    }

    @GetMapping("/getEmployeId/{ide}")
    public Employe getEmployeById(@PathVariable long ide) {
        return ie.retrieveEmploye(ide);
    }

    @DeleteMapping("/deleteEmploye/{idee}")
    public void deleteEmploye(@PathVariable long idee) {
        ie.removeEmploye(idee);
    }

    @PutMapping("/updateEmploye")
    public Employe updateEmploye(@RequestBody Employe e) {
        return ie.updateEmploye(e);
    }
}
