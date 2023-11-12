package pe.edu.cibertec.pregunta_6;

class Contador {


    private int valorInicial;
    private int incremento;
    private int limite;

    public Contador(int valorInicial, int incremento, int limite) {
        this.valorInicial = valorInicial;
        this.incremento = incremento;
        this.limite = limite;
    }

    public int incrementar() {
        int valorActual = valorInicial + incremento;

        if (valorActual > limite) {
            valorActual = valorInicial;
        }

        return valorActual;
    }
}

/*
class Contador {

    private int valorInicial;
    private int incremento;
    private int limite;

    public Contador(int valorInicial, int incremento, int limite) {
        this.valorInicial = valorInicial;
        this.incremento = incremento;
        this.limite = limite;
    }

    public int incrementar() {
        int valorActual = valorInicial + incremento;

        if (valorActual > limite) {
            valorActual = valorInicial;
        }

        return valorActual;
    }
}
 */