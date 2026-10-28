package atividades;

public class TabuadaMultiplicacao implements Tabuada{
    int numero;

    public TabuadaMultiplicacao(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numero + " = " + (numero * i));
        };
    }
}
