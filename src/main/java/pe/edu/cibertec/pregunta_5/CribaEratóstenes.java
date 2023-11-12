package pe.edu.cibertec.pregunta_5;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

class CribaEratóstenes {

    private int n;

    public CribaEratóstenes(int n) {
        this.n = n;
    }

    public List<Integer> calcular() {
        List<Integer> primos = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            primos.add(i);
        }

        return primos;
    }
}
/*
class CribaEratóstenes {

    private int n;

    public CribaEratóstenes(int n) {
        this.n = n;
    }

    public List<Integer> calcular() {
        List<Integer> primos = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (!primos.contains(i)) {
                primos.add(i);

                for (int j = i * 2; j <= n; j += i) {
                    primos.remove(j);
                }
            }
        }

        return primos;
    }
}
*/


