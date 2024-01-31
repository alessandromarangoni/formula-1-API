package it.betacom.scuderie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import it.betacom.scuderie.Scuderie;

@RestController
@RequestMapping("/scuderie")
public class ScuderieController {

    @Autowired
    private ScuderieService scuderieService;

    @GetMapping
    public List<Scuderie> getAllScuderie() {
        return scuderieService.getAllScuderie();
    }
}
