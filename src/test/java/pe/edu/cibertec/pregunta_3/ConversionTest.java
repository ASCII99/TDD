package pe.edu.cibertec.pregunta_3;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {
    private TipoCambioService tipoCambioService;
    @Before
    public void setUp() {
        tipoCambioService = new TipoCambioService() {
            @Override
            public double getTipoCambio(Divisa divisa) {
                if (divisa == Divisa.MXN) {
                    return 20.0;
                } else if (divisa == Divisa.CAD) {
                    return 30.0;
                } else if (divisa == Divisa.EURO) {
                    return 40.0;
                } else {
                    throw new IllegalArgumentException("Divisa no válida: " + divisa);
                }
            }
        };
    }

    @Test
    public void MontoDeMXNADolar() {
        Mockito.when(tipoCambioService.getTipoCambio(Divisa.MXN)).thenReturn(20.0);
        double montoConvertido = new Conversion(tipoCambioService).convertir(Divisa.MXN, 100);
        Assertions.assertEquals(2000.0, montoConvertido);
    }

    @Test
    public void MontoDeCADADolar() {
        Mockito.when(tipoCambioService.getTipoCambio(Divisa.CAD)).thenReturn(30.0);
        double montoConvertido = new Conversion(tipoCambioService).convertir(Divisa.CAD, 100);
        Assertions.assertEquals(3000.0, montoConvertido);
    }

    @Test
    public void MontoDeEUROADolar() {
        // Arrange
        Mockito.when(tipoCambioService.getTipoCambio(Divisa.EURO)).thenReturn(40.0);
        double montoConvertido = new Conversion(tipoCambioService).convertir(Divisa.EURO, 100);
        Assertions.assertEquals(4000.0, montoConvertido);
    }

}