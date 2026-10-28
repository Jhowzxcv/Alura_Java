package br.com.alura.screenmatch.calculos;

public class Quadrilatero implements Forma{
    private double base;
    private double altura;
    private String nome;

    public Quadrilatero(String nome, double base, double altura){
        this.nome = nome;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    public String getNome() {
        return nome;
    }
}
