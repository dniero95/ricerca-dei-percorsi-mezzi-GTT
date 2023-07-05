package its.darioniero.gttvehiclepathfinder.services;

import its.darioniero.gttvehiclepathfinder.entities.Fermata;
import its.darioniero.gttvehiclepathfinder.repository.FermataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FermataService {

    @Autowired
    FermataRepository fermataRepository;
    public List<Fermata> fetchAllFermata() {

        List<Fermata> allFermata = new ArrayList<>();

        for (Fermata fermata :
                fermataRepository.findAll()) {
            allFermata.add(fermata);
        }
        return allFermata;
    }

    public void saveManyFermata(List<Fermata> fermate) {
        fermataRepository.saveAll(fermate);
    }
}
