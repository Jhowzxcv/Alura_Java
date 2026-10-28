package br.com.alura.screenmatch.modelos;

public record Livro(String titulo, String autor, Editora editora ) {
    @Override
    public String toString() {
        return "titulo: " + titulo + '\n' +
                "autor: " + autor + '\n' +
                "editora: " + editora.nome + ", " + editora.cidade;
    }
}
