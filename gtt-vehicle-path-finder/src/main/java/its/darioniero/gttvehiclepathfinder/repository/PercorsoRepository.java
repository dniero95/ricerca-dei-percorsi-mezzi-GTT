package its.darioniero.gttvehiclepathfinder.repository;


import its.darioniero.gttvehiclepathfinder.entities.Percorso;
import its.darioniero.gttvehiclepathfinder.models.PercorsoId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PercorsoRepository extends CrudRepository<Percorso, PercorsoId> {
    List<Percorso> findByPercorsoIdIdFermata(String idFermata);
}
