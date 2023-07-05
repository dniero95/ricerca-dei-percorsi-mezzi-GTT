package its.darioniero.gttvehiclepathfinder.controllers;

import its.darioniero.gttvehiclepathfinder.entities.Percorso;
import its.darioniero.gttvehiclepathfinder.services.PercorsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/percorso")
public class PercorsoController {

    @Autowired
    PercorsoService percorsoService;

    @PostMapping
    public void saveAllPercorso(@RequestBody List<Percorso> percorsi){
        percorsoService.saveAllPercorso(percorsi);
    }
}
