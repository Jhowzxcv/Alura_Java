package br.com.alura.Atividades;

import br.com.alura.Atividades.models.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

@SpringBootApplication
public class AtividadesApplication implements CommandLineRunner{

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

		IMultiplicacao multiplicacao = (a, b) -> a * b;

		int resultado = multiplicacao.multiplica(5, 7);
		System.out.println("Resultado da multiplicação: " + resultado);

		IVerificadorDeNumeroPrimo verifica = numero -> {
			if (numero < 2) return false;
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) return false;
			}
			return true;
		};

		int numeroTeste = 29;
		System.out.println(numeroTeste + (verifica.ehPrimo(numeroTeste)? " é primo" : " não é primo"));

		IConverteParaMaiusculo conversor = String::toUpperCase;
		String str = "Teste do conversor";

		System.out.println(conversor.converte(str));

		IVerificaPalindromo verificador = texto -> {
			String invertida = new StringBuilder(texto).reverse().toString();
			return texto.equalsIgnoreCase(invertida);
        };

		String teste1 = "arara";
		String teste2 = "palíndromo";

		System.out.println(teste1 + (verificador.verificar(teste1) ? " é um palíndormo" : " não é um Palíndromo" ));
		System.out.println(teste2 + (verificador.verificar(teste2) ? " é um palíndormo" : " não é um Palíndromo" ));


		List<String> nomes = new ArrayList<>(Arrays.asList("Carlos", "Ana", "Bruno"));

		Collections.sort(nomes, (s1, s2) -> s1.compareTo(s2));

		System.out.println(nomes); // Imprime a lista ordenada: [Ana, Bruno, Carlos]
	}
}


