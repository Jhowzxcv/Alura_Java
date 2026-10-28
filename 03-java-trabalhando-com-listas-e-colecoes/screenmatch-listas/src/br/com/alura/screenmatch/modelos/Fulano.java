package br.com.alura.screenmatch.modelos;

public record Fulano(String nome, Integer idade, String cidade) {
    @Override
    public String toString() {
        return "nome: " + nome + '\n' +
                "idade: " + idade + '\n' +
                "cidade: " + cidade + '\n'
                ;
    }

    public Fulano {
        nome = (nome == null) ? "desconhecido" : nome;
        idade = (idade == null || idade == 0) ? -1 : idade;
        cidade = (cidade == null) ? "Não informada" : cidade;
    }
}
