package its.darioniero.gttvehiclepathfinder.controllers;

import its.darioniero.gttvehiclepathfinder.entities.Linea;
import its.darioniero.gttvehiclepathfinder.services.LineaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/linea")
public class LineaController {

    @Autowired
    private LineaService lineaService;

    @GetMapping
    public List<Linea> findLineaBetweenTwoFermata(@PathVariable String firstFermata, @PathVariable String secondFermata){
        return lineaService.findLineaBetweenTwoFermata(firstFermata, secondFermata);
    }

    @PostMapping
    public void saveManyLinea(@RequestBody List<Linea> linee){
        lineaService.saveManyLinea(linee);
    }

}
