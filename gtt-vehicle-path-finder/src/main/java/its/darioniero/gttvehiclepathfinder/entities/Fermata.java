package its.darioniero.gttvehiclepathfinder.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "fermata")
public class Fermata {

    @Id
    @Column(name = "id_fermata")
    private String idFermata;

    @Column(name = "nome_fermata")
    private String nomeFermata;

}
