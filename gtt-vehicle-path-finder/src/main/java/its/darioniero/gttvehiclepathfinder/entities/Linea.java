package its.darioniero.gttvehiclepathfinder.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "linea")
public class Linea {
    @Id
    @Column(name = "id_linea")
    String idLinea;
}
