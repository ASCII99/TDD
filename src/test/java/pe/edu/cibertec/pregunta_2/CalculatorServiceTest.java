package pe.edu.cibertec.pregunta_2;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private DataService dataService = new DataServiceImpl();

    @Test
    public void testCalculateAverage() {
        int[] numbers = dataService.getListOfNumbers();

        CalculatorService calculatorService = new CalculatorServiceImpl();
        double average = calculatorService.calculateAverage(numbers);

        assertEquals(3, average);
    }
}
