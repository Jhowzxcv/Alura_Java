package atividades;

public class Livro implements Calculavel{
    private String titulo;
    private String autor;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String exibirDetalhes(){
        return "Titulo: " + titulo + ", Autor: "  + autor;
    }

    @Override
    public double calcularPrecoFinal(int desconto, int taxaAdicional) {
        return preco - preco *((double) (desconto - taxaAdicional) /100);
    }
}
