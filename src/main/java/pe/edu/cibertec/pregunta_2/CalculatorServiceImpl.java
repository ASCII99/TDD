package pe.edu.cibertec.pregunta_2;

public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }
}
