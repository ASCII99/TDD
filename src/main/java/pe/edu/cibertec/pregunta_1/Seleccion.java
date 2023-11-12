package pe.edu.cibertec.pregunta_1;

import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class Seleccion {
    public String sexo;
    public int edad;
    public double estatura;
    public double peso;

    public boolean esApto() {
        if (sexo.equals("M")) {
            return edad >= 18 && estatura >= 1.70 && peso < 70;
        } else {
            return edad >= 16 && estatura >= 1.70 && peso <= 60;
        }
    }
}
