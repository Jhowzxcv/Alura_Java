package br.com.alura.screenmatch.modelos;

public class Pessoa {
    private String nome;
    private int idade;

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "-Idade: " + this.getIdade() + " anos";
}

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    }
