package pe.edu.cibertec.pregunta_1;

import org.junit.jupiter.api.Test;
import pe.edu.cibertec.pregunta_1.Seleccion;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SeleccionTest {

    @Test
    public void testEsAptoMasculino() {
        Seleccion apto = new Seleccion("M", 20, 1.80, 65);
        assertTrue(apto.esApto());
    }

    @Test
    public void testEsAptaFemenino() {
        Seleccion apto = new Seleccion("F", 17, 1.75, 55);
        assertTrue(apto.esApto());
    }

    @Test
    public void testNoEsAptoMasculino() {
        Seleccion apto = new Seleccion("M", 17, 1.60, 75);
        assertFalse(apto.esApto());
    }

    @Test
    public void testNoEsAptaFemenino() {
        Seleccion apto = new Seleccion("F", 21, 1.85, 61);
        assertFalse(apto.esApto());
    }

    @Test
    public void testEsAptoSexoNoValido() {
        Seleccion apto = mock(Seleccion.class);
        when(apto.getSexo()).thenReturn("X");
        assertFalse(apto.esApto());
    }
}