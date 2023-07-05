package its.darioniero.gttvehiclepathfinder.services;


import its.darioniero.gttvehiclepathfinder.entities.Percorso;
import its.darioniero.gttvehiclepathfinder.repository.PercorsoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PercorsoService {

    @Autowired
    private PercorsoRepository percorsoRepository;

    public List<Percorso> findPercorsoByIdFermata(String idFermata) {
        List<Percorso> byIdIdFermata = percorsoRepository.findByPercorsoIdIdFermata(idFermata);
        return byIdIdFermata;
    }

    public void saveAllPercorso(List<Percorso> percorsi) {
        percorsoRepository.saveAll(percorsi);
    }
}
