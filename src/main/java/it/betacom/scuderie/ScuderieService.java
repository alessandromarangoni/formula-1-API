package it.betacom.scuderie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import it.betacom.scuderie.Scuderie;

@Service
public class ScuderieService {

    @Autowired
    private ScuderieRepository scuderieRepository;

    public List<Scuderie> getAllScuderie() {
        return scuderieRepository.findAll();
    }
}
