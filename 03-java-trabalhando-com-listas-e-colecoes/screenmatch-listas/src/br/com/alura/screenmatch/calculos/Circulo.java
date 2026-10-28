package br.com.alura.screenmatch.calculos;

public class Circulo implements Forma {

    private double raio;
    private String nome;

    public Circulo(String nome, double raio){
        this.nome = nome;
        this.raio = raio;
    }





    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String getNome() {
        return nome;
    }


}
