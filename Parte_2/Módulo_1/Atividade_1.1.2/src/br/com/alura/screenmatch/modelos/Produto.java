package br.com.alura.screenmatch.modelos;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                ", Preço: " + this.getPreco() +
                ", Quantidade: " + this.getQuantidade();
    }

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
   }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
