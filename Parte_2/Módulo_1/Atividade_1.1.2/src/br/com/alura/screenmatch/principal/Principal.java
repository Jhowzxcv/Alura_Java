package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.*;
import br.com.alura.screenmatch.modelos.*;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());


        // Atividade 1
       /* var paulo = new Pessoa();
        paulo.setNome("Paulo");
        paulo.setIdade(31);

        var thaina = new Pessoa();
        thaina.setNome("Thaina");
        thaina.setIdade(16);

        var jhonathan = new Pessoa();
        jhonathan.setNome("Jhonathan");
        jhonathan.setIdade(17);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(paulo);
        listaDePessoas.add(thaina);
        listaDePessoas.add(jhonathan);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas); */

         // Atividade 2
        /*Produto detergente = new Produto("Detergente", 3.50, 30);
        Produto sabaoEmPo = new Produto("Sabão em Pó", 12.00, 15);
        Produto esponja = new Produto("Esponja", 2.00, 50);
        Produto papelToalha = new Produto("Papel Toalha", 8.00, 20);
        Produto alcool = new Produto("Álcool 70%", 10.50, 25);
        ProdutoPerecivel leite = new ProdutoPerecivel("Leite", 3.50, 20, "15/02/2025");
        ProdutoPerecivel queijo = new ProdutoPerecivel("Queijo", 15.00, 10, "10/01/2025");
        ProdutoPerecivel iogurte = new ProdutoPerecivel("Iogurte", 4.99, 30, "20/03/2025");

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(detergente);
        listaDeProdutos.add(sabaoEmPo);
        listaDeProdutos.add(esponja);
        listaDeProdutos.add(papelToalha);
        listaDeProdutos.add(alcool);
        listaDeProdutos.add(leite);
        listaDeProdutos.add(queijo);
        listaDeProdutos.add(iogurte);

        double total = 0;
        System.out.println("recuperando produto com indice 4 " + listaDeProdutos.get(4));
        System.out.println(listaDeProdutos);
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            double valor = listaDeProdutos.get(i).getPreco();
            total += valor;
        };
        double media = total/ listaDeProdutos.size();
        double mediaArredondada = (double) Math.round(media * 100) /100;
        System.out.println("Média dos valores dos produtos: " + mediaArredondada);*/

        Circulo circulo = new Circulo("circulo", 4);
        Quadrilatero quadrilatero = new Quadrilatero("quadrilatero", 3, 4);

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo);
        listaDeFormas.add(quadrilatero);

        for (int i = 0; i < listaDeFormas.size(); i++) {
            System.out.println(listaDeFormas.get(i).getNome() +": " +listaDeFormas.get(i).calcularArea());
        }



    }
}