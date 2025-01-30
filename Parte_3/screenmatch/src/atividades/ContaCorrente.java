package atividades;

public class ContaCorrente extends ContaBancaria{


    public double cobrarTarifaMensal(double valor){
        return saldo -= valor;
    }
}
