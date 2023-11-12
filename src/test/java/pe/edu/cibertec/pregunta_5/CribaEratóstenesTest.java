package pe.edu.cibertec.pregunta_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class CribaEratóstenesTest {

    @Test
    void ListaDeNumerosPrimos() {
        // Arrange
        CribaEratóstenes criba = new CribaEratóstenes(100);

        // Act
        List<Integer> primos = criba.calcular();

        // Assert
        Assertions.assertEquals(99, primos.size());
        Assertions.assertEquals(2, primos.get(0));
        Assertions.assertEquals(3, primos.get(1));
        Assertions.assertEquals(4, primos.get(2));
        // ...
    }
}
