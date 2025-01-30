package atividades;

public class ContaBancaria {
    private int numeroConta;
    protected double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valor){
        return this.saldo += valor;
    }

    public double sacar(double valor){
        return this.saldo -= valor;
    }
}
