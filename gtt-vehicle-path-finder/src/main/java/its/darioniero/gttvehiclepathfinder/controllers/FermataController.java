package its.darioniero.gttvehiclepathfinder.controllers;


import its.darioniero.gttvehiclepathfinder.entities.Fermata;
import its.darioniero.gttvehiclepathfinder.services.FermataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
