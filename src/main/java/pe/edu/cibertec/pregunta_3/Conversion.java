package pe.edu.cibertec.pregunta_3;

public class Conversion {
    private TipoCambioService tipoCambioService;

    public Conversion(TipoCambioService tipoCambioService) {
        this.tipoCambioService = tipoCambioService;
    }

    public double convertir(Divisa divisa, double monto) {
        double tipoCambio = tipoCambioService.getTipoCambio(divisa);
        return tipoCambio * monto;
    }
}
