package atividades;

import java.time.LocalDate;

public class Praticas {
    public static void main(String[] args) {
         atividades.Pessoa pessoa = new atividades.Pessoa();
        System.out.println(pessoa.ola());

        atividades.Calculadora calculadora = new atividades.Calculadora();
        System.out.println(calculadora.dobra(2));

        atividades.Musica musica = new atividades.Musica();
        musica.nome = "All girls are the same";
        musica.artista = "Juice WRLD";
        musica.anoDeLancamento = 2018;

        musica.exibeFichaTecnica();
        musica.avalia(8);
        musica.avalia(5);
        musica.avalia(10);
        System.out.println(musica.somaDasAvaliacoes);
        System.out.println(musica.totalDeAvaliacoes);
        System.out.println(musica.pegaMedia());

        atividades.Carro carro = new atividades.Carro();
        carro.modelo = "Opala";
        carro.ano = 1971;
        carro.cor = "preto";

        carro.exibeFichaTecnica();
        System.out.println("Idade do carro: " + carro.idade(LocalDate.now().getYear()));

        atividades.Aluno aluno = new atividades.Aluno();
        aluno.setNome("Carlos Rodrigues");
        aluno.setIdade(16);

        aluno.guardaNotas(10);
        aluno.guardaNotas(8);
        aluno.guardaNotas(2);

        System.out.println(aluno.exibeInformacoes());
        System.out.println(aluno.calcularMedia());

        IdadePessoa marcos = new IdadePessoa();
        marcos.setNome("Marcos");
        marcos.setIdade(36);
        System.out.println(marcos.verificarIdade());

        Produto macarrao = new Produto();
        macarrao.setNome("Macarrão");
        macarrao.setPreco(20);

        System.out.println(macarrao.aplicarDesconto(50));

        Livro harry = new Livro();
        harry.setTitulo("Harry Potter");
        harry.setAutor("J. K. Rooling");

        System.out.println(harry.exibirDetalhes());
    }
}
