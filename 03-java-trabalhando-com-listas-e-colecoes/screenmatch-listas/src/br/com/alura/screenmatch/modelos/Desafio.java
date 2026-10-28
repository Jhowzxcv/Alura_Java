package br.com.alura.screenmatch.modelos;

public class Desafio implements Comparable<Desafio> {
    private String nome;
    private double valor;

    public Desafio(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return nome + "-" + valor;
    }

    public String getNome() {
        return nome;
    }

   /* public int getValor() {
        return valor;
    }*/


    public int compareTo(Desafio o) {
        return Double.compare(this.valor, o.valor);
    }

}
