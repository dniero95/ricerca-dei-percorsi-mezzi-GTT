package its.darioniero.gttvehiclepathfinder.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PercorsoId implements Serializable {
    private String idLinea;
    private String idFermata;

}
