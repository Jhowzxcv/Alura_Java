package br.com.alura.screenmatch.modelos;

public class Editora {
    String nome;
    String cidade;

    public Editora(String nome, String cidade) {
        nome = this.nome;
        cidade = this.cidade;
    }

    @Override
    public String toString() {
        return "nome: " + nome + '\n' +
                "cidade: " + cidade;
    }
}
