package it.betacom.piloti; // Assicurati che il package corrisponda alla struttura del tuo progetto

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/piloti")
public class PilotiController {

    @Autowired
    private PilotiService pilotiService;

    @GetMapping
    public ResponseEntity<List<Piloti>> getAllPiloti() {
        List<Piloti> piloti = pilotiService.getAllPiloti();
        return new ResponseEntity<>(piloti, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Piloti> addPilota(@RequestBody @Valid Piloti pilota) {
        Piloti nuovoPilota = pilotiService.addPilota(pilota);
        return new ResponseEntity<>(nuovoPilota, HttpStatus.CREATED);
    }
}
