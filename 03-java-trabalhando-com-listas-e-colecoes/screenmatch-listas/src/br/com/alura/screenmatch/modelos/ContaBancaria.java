package br.com.alura.screenmatch.modelos;

public class ContaBancaria {
    private int numeroDaConta;
    private int saldo;

    public ContaBancaria(int numeroDaConta, int saldo){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
}
