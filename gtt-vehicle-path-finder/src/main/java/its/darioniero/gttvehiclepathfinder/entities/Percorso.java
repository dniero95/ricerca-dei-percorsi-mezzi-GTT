package its.darioniero.gttvehiclepathfinder.entities;


import its.darioniero.gttvehiclepathfinder.models.PercorsoId;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "percorso")
public class Percorso {

    @EmbeddedId
    private PercorsoId percorsoId;

    @Column(name = "num_ordine")
    private int numOrdine;
}
