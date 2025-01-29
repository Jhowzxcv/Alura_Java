import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme =  new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média: " + meuFilme.pegaMedia());

       /* atividades.Pessoa pessoa = new atividades.Pessoa();
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
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

        atividades.Carro carro = new atividades.Carro();
        carro.modelo = "Opala";
        carro.ano = 1971;
        carro.cor = "preto";

        carro.exibeFichaTecnica();
        System.out.println("Idade do carro: " + carro.idade(LocalDate.now().getYear()));

        atividades.Aluno aluno = new atividades.Aluno();
        aluno.nome = "Carlos Rodrigues";
        aluno.idade = 16;

        System.out.println(aluno.exibeInformacoes());*/
    }


}