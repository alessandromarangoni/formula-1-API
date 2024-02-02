package it.betacom.piloti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PilotiService {

    @Autowired
    private PilotiRepository pilotiRepository;

    public List<Piloti> getAllPiloti() {
        return pilotiRepository.findAll();
    }

    public Piloti addPilota(Piloti pilota){
        pilotiRepository.save(pilota);
        return pilota;
    }
}
