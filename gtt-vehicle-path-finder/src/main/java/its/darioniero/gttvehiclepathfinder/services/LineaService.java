package its.darioniero.gttvehiclepathfinder.services;

import its.darioniero.gttvehiclepathfinder.entities.Linea;
import its.darioniero.gttvehiclepathfinder.entities.Percorso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LineaService {

    @Autowired
    private PercorsoService percorsoService;
    public List<Linea> findLineaBetweenTwoFermata(String firstFermata, String secondFermata) {

        List<Percorso> allFirstFermataPercorso = new ArrayList<>();
        List<Percorso> allSecondFermataPercorso = new ArrayList<>();
        List<Linea> allSelectedLinea = new ArrayList<>();

        return allSelectedLinea;

    }
}
