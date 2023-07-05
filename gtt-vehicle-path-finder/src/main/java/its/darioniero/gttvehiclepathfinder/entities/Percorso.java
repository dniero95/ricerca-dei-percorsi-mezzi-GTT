package its.darioniero.gttvehiclepathfinder.entities;

import its.darioniero.gttvehiclepathfinder.models.PercorsoId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "percorso")
public class Percorso {

    @EmbeddedId
    private PercorsoId percorsoId;

    @Column(name = "num_ordine")
    private int numOrdine;

    public PercorsoId getPercorsoId() {
        return percorsoId;
    }

    public void setPercorsoId(PercorsoId percorsoId) {
        this.percorsoId = percorsoId;
    }

    public int getNumOrdine() {
        return numOrdine;
    }

    public void setNumOrdine(int numOrdine) {
        this.numOrdine = numOrdine;
    }

}
