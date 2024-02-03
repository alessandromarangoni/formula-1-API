package it.betacom.scuderie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import it.betacom.scuderie.Scuderie;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/scuderie")
public class ScuderieController {

    @Autowired
    private ScuderieService scuderieService;


    @GetMapping
    public List<Scuderie> getAllScuderie() {
        return scuderieService.getAllScuderie();
    }

    @GetMapping("/{id}")
    public Scuderie getScuderiaById(@PathVariable Long id) { // @PathVariable per legare il parametro 'id' dal percorso
        return scuderieService.getScuderiaById(id);
    }

}
