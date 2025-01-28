import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme =  new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

       /* Pessoa pessoa = new Pessoa();
        System.out.println(pessoa.ola());

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dobra(2));

        Musica musica = new Musica();
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

        Carro carro = new Carro();
        carro.modelo = "Opala";
        carro.ano = 1971;
        carro.cor = "preto";

        carro.exibeFichaTecnica();
        System.out.println("Idade do carro: " + carro.idade(LocalDate.now().getYear()));

        Aluno aluno = new Aluno();
        aluno.nome = "Carlos Rodrigues";
        aluno.idade = 16;

        System.out.println(aluno.exibeInformacoes());*/
    }


}