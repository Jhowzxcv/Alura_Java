package atividades;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Praticas {
    public static void main(String[] args) throws IOException, InterruptedException {
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

        double[] precoOpala = {125, 135, 150};
        atividades.Carro carro = new atividades.Carro("Opala",precoOpala );
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
        harry.setPreco(200);
        System.out.println(harry.calcularPrecoFinal(10, 25));

        System.out.println(harry.exibirDetalhes());

        double[] precoCamaro = {250, 350, 400};
        Arrays.sort(precoCamaro);

        double menor = precoCamaro[0];
        double maior = precoCamaro[precoCamaro.length-1];

        Carro camaro = new Carro("camaro", precoCamaro);
        System.out.println("dentro dos 3 anos o menor preço é: "+ menor + " e o maior: " + maior);

        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        System.out.println("ações do gato: " + gato.emitirSom() + ", " + gato.arranharMoveis());
        System.out.println("ações do cachorro: " + cachorro.emitirSom() + ", " + cachorro.abanarRabo());

        ContaCorrente conta = new ContaCorrente();
        conta.setSaldo(1000);
        conta.cobrarTarifaMensal(30);
        System.out.println(conta.getSaldo());

        GeradorDePrimos gerador = new GeradorDePrimos();

        int numero = 38;
        int proximo = gerador.proximoPrimo(numero);
        System.out.println("o primo depois de "+ numero +  " é: " + proximo);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor à ser convertido de dolar para real");
        double valor = scanner.nextDouble();

        ConversorMoeda conversorMoeda = new ConversorMoeda();
        System.out.println(conversorMoeda.pegaCotacao());
        System.out.println(conversorMoeda.converterDolarParaReal(valor));


        CalculadoraSalaRetangular retangular = new CalculadoraSalaRetangular(2,2);
        System.out.println(retangular.calcularArea());
        System.out.println(retangular.calcularPerimetro());

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao(8);
        tabuada.mostrarTabuada();

        ConversorTemperaturaPadrao temperaturaPadrao = new ConversorTemperaturaPadrao(36);
        System.out.println("Celsius para Fahrenheit: " + temperaturaPadrao.celsiusParaFahrenheit());
        System.out.println("Fahrenheit para Celsius: " + temperaturaPadrao.fahrenheitParaCelsius());


    }
}
