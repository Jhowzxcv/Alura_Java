package br.com.alura.Atividades;

import br.com.alura.Atividades.models.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class AtividadesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AtividadesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o numero: ");
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println(i+1);
		}

		Tarefa ex1 = new Tarefa();
		ex1.setDescricao("contador até o numero que o usuario indicar");
		ex1.setConcluida(true);
		ex1.setPessoaResponsavel("Jaqueline");
		ObjectMapper objectMapper = new ObjectMapper();

		objectMapper.writeValue(new File("Tarefa.json"), ex1);

		ConverteDados converteDados = new ConverteDados();
		Tarefa convertido = converteDados.converteDados(Files.readString(Paths.get("Tarefa.json")), Tarefa.class);
		System.out.println(convertido);

		// Criando listas de avaliações
		List<Avaliacao<Produto>> avaliacoesProduto = new ArrayList<>();
		List<Avaliacao<Servico>> avaliacoesServico = new ArrayList<>();
		List<Avaliacao<Assinatura>> avaliacoesAssinatura = new ArrayList<>();

		// Criando objetos
		Produto celular = new Produto("Celular", 1500);
		Produto notebook = new Produto("Notebook", 3500);
		Produto fone = new Produto("Fone de Ouvido", 200);

		Servico instalacaoTV = new Servico("Instalação de TV", 150);
		Servico reformaCozinha = new Servico("Reforma da Cozinha", 5000);
		Servico limpezaEstofados = new Servico("Limpeza de Estofados", 300);

		Assinatura netflix = new Assinatura("Netflix", 39.90);
		Assinatura spotify = new Assinatura("Spotify", 19.90);
		Assinatura gamePass = new Assinatura("Xbox Game Pass", 49.90);

		// Adicionando avaliações
		avaliacoesProduto.add(new Avaliacao<>(celular, 5, "Ótimo produto! Super rápido."));
		avaliacoesProduto.add(new Avaliacao<>(notebook, 4, "Bom, mas poderia ser mais barato."));
		avaliacoesProduto.add(new Avaliacao<>(fone, 3, "Qualidade de som razoável."));

		avaliacoesServico.add(new Avaliacao<>(instalacaoTV, 5, "Profissional pontual e rápido."));
		avaliacoesServico.add(new Avaliacao<>(reformaCozinha, 3, "Demorou mais que o esperado."));
		avaliacoesServico.add(new Avaliacao<>(limpezaEstofados, 4, "Bom serviço, mas caro."));

		avaliacoesAssinatura.add(new Avaliacao<>(netflix, 4, "Muitos filmes bons, mas catálogo poderia ser maior."));
		avaliacoesAssinatura.add(new Avaliacao<>(spotify, 5, "Melhor app de música, vale cada centavo!"));
		avaliacoesAssinatura.add(new Avaliacao<>(gamePass, 3, "Tem jogos legais, mas falta novidade."));

		// Calculando médias
		double mediaProduto = Avaliacao.calcularMedia(avaliacoesProduto);
		double mediaServico = Avaliacao.calcularMedia(avaliacoesServico);
		double mediaAssinatura = Avaliacao.calcularMedia(avaliacoesAssinatura);

		// Exibindo as médias
		System.out.println("Média de avaliações de Produtos: " + mediaProduto);
		System.out.println("Média de avaliações de Serviços: " + mediaServico);
		System.out.println("Média de avaliações de Assinaturas: " + mediaAssinatura);
	}
}
