package atividades;

public class Carro {
    String modelo;
    int ano;
    String cor;
    private double[] precos;

    public Carro(String modelo, double[] precos){
        this.modelo = modelo;
        this.precos = precos;
    }

    void exibeFichaTecnica() {
        System.out.println("Modelo do veículo: " + modelo);
        System.out.println("Ano do veículo: " + ano);
        System.out.println("Cor do veículo: " + cor);
    }

    int idade(int anoAtual){
        return anoAtual - ano;
    }

    public void pegaPrecoMedioAnual(int ano, double valor){

    }
}
