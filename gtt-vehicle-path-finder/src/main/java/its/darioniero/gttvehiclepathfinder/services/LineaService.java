package its.darioniero.gttvehiclepathfinder.services;

import its.darioniero.gttvehiclepathfinder.entities.Linea;
import its.darioniero.gttvehiclepathfinder.entities.LineaRepository;
import its.darioniero.gttvehiclepathfinder.entities.Percorso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LineaService {

    @Autowired
    private PercorsoService percorsoService;
    @Autowired
    private LineaRepository lineaRepository;

    public List<Linea> findLineaBetweenTwoFermata(String firstFermata, String secondFermata) {

        List<Percorso> allFirstFermataPercorso = percorsoService.findPercorsoByIdFermata(firstFermata);
        List<Percorso> allSecondFermataPercorso = percorsoService.findPercorsoByIdFermata(secondFermata);

        List<Linea> allSelectedLinea = new ArrayList<>();

        for (Percorso firstFermataPercorso : allFirstFermataPercorso) {
            for (Percorso secondFermataPercorso : allSecondFermataPercorso) {
                if(firstFermataPercorso.getPercorsoId().getIdLinea().equals(secondFermataPercorso.getPercorsoId().getIdLinea())){
                    Optional<Linea> linea = lineaRepository.findById(firstFermataPercorso.getPercorsoId().getIdLinea());
                    if (linea.isPresent()) {
                        allSelectedLinea.add(linea.get());
                    }
                }
            }
        }

        return allSelectedLinea;

    }

    public void saveManyLinea(List<Linea> linee) {
        lineaRepository.saveAll(linee);
    }
}
