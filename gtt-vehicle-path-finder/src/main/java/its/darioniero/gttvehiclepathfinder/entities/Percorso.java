package its.darioniero.gttvehiclepathfinder.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "percorso")
public class Percorso {

    @Id
    @Column(name = "id_linea")
    private String idLinea;
    @Id
    @Column(name = "id_fermata")
    private String idFermata;

    @Column(name = "num_ordine")
    private int numOrdine;
}
