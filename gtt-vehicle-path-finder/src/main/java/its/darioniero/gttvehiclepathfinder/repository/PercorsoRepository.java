package its.darioniero.gttvehiclepathfinder.repository;

import its.darioniero.gttvehiclepathfinder.entities.Percorso;
import its.darioniero.gttvehiclepathfinder.models.PercorsoId;
import org.springframework.data.repository.CrudRepository;

public interface PercorsoRepository extends CrudRepository<Percorso, PercorsoId> {
}
