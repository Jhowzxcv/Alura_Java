package br.com.alura.Atividades.models;

public class Produto2 {
    private String nome;
    private double preco;
    private String categoria;

    public Produto2(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\'' +
                ", preco: " + preco +
                ", categoria: " + categoria;
    }
}
