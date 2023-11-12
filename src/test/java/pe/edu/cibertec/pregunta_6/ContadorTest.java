package pe.edu.cibertec.pregunta_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContadorTest {
    @Test
    void incrementarElContador() {
        // Arrange
        Contador contador = new Contador(10, 2, 100);

        // Act
        int valorActual = contador.incrementar();

        // Assert
        Assertions.assertEquals(12, valorActual);
    }

}