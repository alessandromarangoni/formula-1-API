package it.betacom.piloti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import it.betacom.piloti.Piloti;

@RestController
@RequestMapping("/piloti")
public class PilotiController {

    @Autowired
    private PilotiService pilotiService;

    @GetMapping
    public List<Piloti> getAllPiloti() {
        return pilotiService.getAllPiloti();
    }
}
