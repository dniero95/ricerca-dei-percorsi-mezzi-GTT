package its.darioniero.gttvehiclepathfinder.controllers;


import its.darioniero.gttvehiclepathfinder.entities.Fermata;
import its.darioniero.gttvehiclepathfinder.services.FermataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fermata")
public class FermataController {

    @Autowired
    private FermataService fermataService;

    @GetMapping
    public List<Fermata> fetchAllFermata() {
        return fermataService.fetchAllFermata();
    }

    @PostMapping
    public void saveManyFermata(@RequestBody List<Fermata> fermate){
        fermataService.saveManyFermata(fermate);
    }
}
