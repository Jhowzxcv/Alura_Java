package br.com.alura.ScreenMatch.principal;

import br.com.alura.ScreenMatch.model.DadosEpisodio;
import br.com.alura.ScreenMatch.model.DadosSerie;
import br.com.alura.ScreenMatch.model.DadosTemporada;
import br.com.alura.ScreenMatch.model.Episodios;
import br.com.alura.ScreenMatch.service.ConsumoApi;
import br.com.alura.ScreenMatch.service.ConverteDados;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    ConsumoApi consumoApi = new ConsumoApi();
    Scanner scanner = new Scanner(System.in);
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";
    private ConverteDados conversor = new ConverteDados();
    public void exibeMenu(){
        System.out.println("Digite o nome da série para busca");
        var serie = scanner.nextLine();
        var json = consumoApi.obterDados(ENDERECO + serie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        		List<DadosTemporada> listaDeTemporadas = new ArrayList<>();

		for (int i = 1; i <= dados.totalTemporadas(); i++) {
			json = consumoApi.obterDados(ENDERECO + serie.replace(" ", "+") + "&season=" + i + API_KEY);
		DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			listaDeTemporadas.add(dadosTemporada);

		}
		listaDeTemporadas.forEach(System.out::println);

//        for(int i = 0; i < dados.totalTemporadas(); i++){
//            List<DadosEpisodio> episodiosTemporada = listaDeTemporadas.get(i).episodios();
//            for(int j = 0; j< episodiosTemporada.size(); j++){
//                System.out.println(episodiosTemporada.get(j).titulo());
//            }
//        }

        listaDeTemporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

        List<DadosEpisodio> dadosEpisodios = listaDeTemporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .toList();


        System.out.println("\nTop 5 episódios!");
        dadosEpisodios.stream()
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
                .limit(5)
                .forEach(System.out::println);

        List<Episodios> episodios =  listaDeTemporadas.stream()
                .flatMap(t -> t.episodios().stream()
                        .map(d -> new Episodios(t.numero(), d)))
                .toList();

        episodios.forEach(System.out::println);

        System.out.println("A partir de que ano você deseja ver os episódios? ");
        var ano = scanner.nextInt();
        scanner.nextLine();

        LocalDate dataBusca = LocalDate.of(ano, 1, 1);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        episodios.stream()
                .filter(e -> e.getDataDeLancamento() != null && e.getDataDeLancamento().isAfter(dataBusca) )
                .forEach(e -> System.out.println(
                        "temporada " + e.getTemporada() +
                                " Episódio: " + e.getTitulo() +
                                " Data Lançamento " + e.getDataDeLancamento().format(formatador)
                ));


    }
}
