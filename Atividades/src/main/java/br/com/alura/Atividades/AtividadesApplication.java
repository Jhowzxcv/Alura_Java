package br.com.alura.Atividades;

import br.com.alura.Atividades.models.*;
import br.com.alura.Atividades.postgres.Categoria;
import br.com.alura.Atividades.postgres.Fornecedor;
import br.com.alura.Atividades.postgres.Pedido;
import br.com.alura.Atividades.postgres.Produto;
import br.com.alura.Atividades.postgres.repository.CategoriaRepository;
import br.com.alura.Atividades.postgres.repository.FornecedorRepository;
import br.com.alura.Atividades.postgres.repository.PedidoRepository;
import br.com.alura.Atividades.postgres.repository.ProdutoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class AtividadesApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private FornecedorRepository fornecedorRepository;

	public static void main(String[] args) {
		SpringApplication.run(AtividadesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o numero: ");
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println(i + 1);
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
		List<Avaliacao<Produto3>> avaliacoesProduto = new ArrayList<>();
		List<Avaliacao<Servico>> avaliacoesServico = new ArrayList<>();
		List<Avaliacao<Assinatura>> avaliacoesAssinatura = new ArrayList<>();

		// Criando objetos
		Produto3 celular = new Produto3("Celular", 1500);
		Produto3 notebook = new Produto3("Notebook", 3500);
		Produto3 fone = new Produto3("Fone de Ouvido", 200);

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
		System.out.println(numeroTeste + (verifica.ehPrimo(numeroTeste) ? " é primo" : " não é primo"));

		IConverteParaMaiusculo conversor = String::toUpperCase;
		String str = "Teste do conversor";

		System.out.println(conversor.converte(str));

		IVerificaPalindromo verificador = texto -> {
			String invertida = new StringBuilder(texto).reverse().toString();
			return texto.equalsIgnoreCase(invertida);
		};

		String teste1 = "arara";
		String teste2 = "palíndromo";

		System.out.println(teste1 + (verificador.verificar(teste1) ? " é um palíndromico" : " não é um palíndromo"));
		System.out.println(teste2 + (verificador.verificar(teste2) ? " é um palíndromico" : " não é um palíndromo"));

		List<String> nomes = new ArrayList<>(Arrays.asList("Carlos", "Ana", "Bruno"));
		Collections.sort(nomes, (s1, s2) -> s1.compareTo(s2));

		System.out.println(nomes); // Imprime a lista ordenada: [Ana, Bruno, Carlos]

		IDivisao divisao = (int a, int b) -> {
			if (b == 0)
				throw new ArithmeticException("O divisor é zero");
			return a / b;
		};

		try {
			System.out.println(divisao.divide(10, 2));
			System.out.println(divisao.divide(10, 0));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
		numeros.stream()
				.filter(n -> n % 2 == 0)
				.forEach(System.out::println);

		List<String> palavras = Arrays.asList("java", "stream", "lambda");
		palavras.stream()
				.map(s -> s.toUpperCase())
				.forEach(System.out::println);

		List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(numeros2.stream()
				.filter(n -> n % 2 != 0)
				.map(n -> n * 2)
				.toList());

		List<String> palavras2 = Arrays.asList("apple", "banana", "apple", "orange", "banana");
		System.out.println(palavras2.stream()
				.collect(Collectors.toSet()));

		// A função 'ehPrimo' agora é uma expressão lambda dentro do 'run'
		IVerificadorDeNumeroPrimo ehPrimo = numero -> {
			if (numero < 2) return false;
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) return false;
			}
			return true;
		};

		List<List<Integer>> listaDeNumeros = Arrays.asList(
				Arrays.asList(1, 2, 3, 4),
				Arrays.asList(5, 6, 7, 8),
				Arrays.asList(9, 10, 11, 12)
		);
		listaDeNumeros.stream()
				.flatMap(Collection::stream)
				.filter(ehPrimo::ehPrimo)
				.forEach(System.out::println);

		List<Pessoa> pessoas = Arrays.asList(
				new Pessoa("Alice", 22),
				new Pessoa("Bob", 17),
				new Pessoa("Charlie", 19)
		);

		pessoas.stream()
				.filter(p -> p.getIdade() >= 18)
				.sorted(Comparator.comparing(Pessoa::getNome))
				.forEach(System.out::println);

		List<Produto2> produtos = Arrays.asList(
				new Produto2("Smartphone", 800.0, "Eletrônicos"),
				new Produto2("Notebook", 1500.0, "Eletrônicos"),
				new Produto2("Teclado", 200.0, "Eletrônicos"),
				new Produto2("Cadeira", 300.0, "Móveis"),
				new Produto2("Monitor", 900.0, "Eletrônicos"),
				new Produto2("Mesa", 700.0, "Móveis")
		);

		System.out.println(produtos.stream()
				.filter(p -> p.getCategoria().equalsIgnoreCase("Eletrônicos") && p.getPreco() < 1000)
				.collect(Collectors.toList()));

		List<String> input = Arrays.asList("10", "abc", "20", "30x");
		List<Integer> inputFiltrado = new ArrayList<>();

		for (String item : input) {
			try {
				inputFiltrado.add(Integer.parseInt(item));
			} catch (NumberFormatException e) {
				// Ignorar exceção
			}
		}
		System.out.println(inputFiltrado);

		System.out.println(processaNumero(Optional.of(5))); // Saída: Optional[25]
		System.out.println(processaNumero(Optional.of(-3))); // Saída: Optional.empty
		System.out.println(processaNumero(Optional.empty()));

		System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
		System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"

		List<String> emails = Arrays.asList("TESTE@EXEMPLO.COM", "exemplo@Java.com ", "Usuario@teste.Com");
		System.out.println(normalizeEmails(emails));
		// Saída: ["teste@exemplo.com", "exemplo@java.com", "usuario@teste.com"]

		System.out.println(Mes.FEVEREIRO.getNumeroDeDias()); // 28
		System.out.println(Mes.JULHO.getNumeroDeDias()); // 31

		System.out.println(CodigoErro.NOT_FOUND.getCodigo()); // 404
		System.out.println(CodigoErro.BAD_REQUEST.getDescricao()); // Requisição inválida

		// INÍCIO DO CÓDIGO CORRIGIDO PARA ASSOCIAÇÃO DE CATEGORIAS E PRODUTOS

		produtoRepository.deleteAll();
		categoriaRepository.deleteAll();
		pedidoRepository.deleteAll();
		fornecedorRepository.deleteAll();

// Criando categorias com IDs gerados (supondo que o ID seja gerado automaticamente ao salvar)
// Criando categorias sem definir ID manualmente
		Categoria eletronicos = new Categoria(null, "Eletrônicos");
		Categoria informatica = new Categoria(null, "Informática");
		Categoria moveis = new Categoria(null, "Móveis");


// Salvando categorias primeiro para que tenham IDs gerados
		categoriaRepository.saveAll(Arrays.asList(eletronicos, informatica, moveis));

// Criando fornecedores
		Fornecedor fornecedor1 = new Fornecedor("Fornecedor A");
		Fornecedor fornecedor2 = new Fornecedor("Fornecedor B");
		Fornecedor fornecedor3 = new Fornecedor("Fornecedor C");
		Fornecedor fornecedor4 = new Fornecedor("Fornecedor D");

		fornecedorRepository.saveAll(Arrays.asList(fornecedor1, fornecedor2, fornecedor3, fornecedor4));

// Usando o novo construtor e associando as categorias
		Produto smartphone = new Produto("Smartphone", 1200.00, eletronicos, fornecedor1);
		Produto tablet = new Produto("Tablet", 800.00, eletronicos, fornecedor2);
		Produto notebookProd = new Produto("Notebook", 3500.00, informatica, fornecedor3);
		Produto mouse = new Produto("Mouse sem fio", 120.00, informatica, fornecedor4);
		Produto teclado = new Produto("Teclado Mecânico", 350.00, informatica, fornecedor1);
		Produto monitor = new Produto("Monitor Full HD", 900.00, informatica, fornecedor2);
		Produto mesa = new Produto("Mesa de escritório", 450.00, moveis, fornecedor3);
		Produto cadeira = new Produto("Cadeira ergonômica", 650.00, moveis, fornecedor4);

// Salvando produtos com suas categorias associadas
		List<Produto> produtosIndividuais = Arrays.asList(
				smartphone, tablet, notebookProd, mouse, teclado, monitor, mesa, cadeira
		);
		produtoRepository.saveAll(produtosIndividuais);

// Abordagem alternativa usando lista de produtos por categoria
		List<Produto> produtosEletronicos = new ArrayList<>();
		produtosEletronicos.add(new Produto("Smart TV", 2500.00, eletronicos, fornecedor1));
		produtosEletronicos.add(new Produto("Fone Bluetooth", 150.00, eletronicos, fornecedor2));

		List<Produto> produtosInformatica = new ArrayList<>();
		produtosInformatica.add(new Produto("SSD 500GB", 450.00, informatica, fornecedor3));
		produtosInformatica.add(new Produto("WebCam HD", 200.00, informatica, fornecedor4));

		List<Produto> produtosMoveis = new ArrayList<>();
		produtosMoveis.add(new Produto("Estante", 800.00, moveis, fornecedor1));
		produtosMoveis.add(new Produto("Sofá 3 lugares", 1800.00, moveis, fornecedor2));

// Salvando os produtos das listas de categorias
		produtoRepository.saveAll(produtosEletronicos);
		produtoRepository.saveAll(produtosInformatica);
		produtoRepository.saveAll(produtosMoveis);



		// Associando produtos às categorias usando setProdutos
		// Este método cuida de estabelecer a relação bidirecional
		eletronicos.setProdutos(produtosEletronicos);
		informatica.setProdutos(produtosInformatica);
		moveis.setProdutos(produtosMoveis);

		// Salvando categorias com seus produtos
		categoriaRepository.saveAll(Arrays.asList(eletronicos, informatica, moveis));

		// Exemplo de consulta das associações
		System.out.println("\n=== Listando categorias e seus produtos ===");
		categoriaRepository.findAll().forEach(categoria -> {
			System.out.println("\nCategoria: " + categoria.getNome());
			System.out.println("Produtos:");
			categoria.getProdutos().forEach(produto ->
					System.out.println(" - " + produto.getNome() + " (R$ " + produto.getPreco() + ")"));
		});

		// Criando pedidos
		Pedido pedido1 = new Pedido(null, LocalDate.now());
		Pedido pedido2 = new Pedido(null, LocalDate.of(2025, 3, 15));

		// Salvando pedidos
		pedidoRepository.saveAll(Arrays.asList(pedido1, pedido2));

		// INÍCIO DO CÓDIGO PARA ASSOCIAÇÃO DE PRODUTOS E PEDIDOS

		// Recuperar produtos e pedidos já salvos
		List<Produto> todosProdutos = produtoRepository.findAll();
		List<Pedido> todosPedidos = pedidoRepository.findAll();

		// Verificar se existem produtos e pedidos para associar
		if (!todosProdutos.isEmpty() && !todosPedidos.isEmpty()) {
			Pedido primeiroPedido = todosPedidos.get(0);
			Pedido segundoPedido = todosPedidos.size() > 1 ? todosPedidos.get(1) : primeiroPedido;

			// Associando alguns produtos ao primeiro pedido
			List<Produto> produtosPrimeiroPedido = new ArrayList<>();
			produtosPrimeiroPedido.add(todosProdutos.get(0)); // Smartphone
			produtosPrimeiroPedido.add(todosProdutos.get(2)); // Notebook
			produtosPrimeiroPedido.add(todosProdutos.get(4)); // Teclado

			// Associar produtos ao pedido (caso Pedido tenha um método setProdutos)
			primeiroPedido.setProdutos(produtosPrimeiroPedido);

			// Também podemos adicionar a referência do pedido em cada produto
			for (Produto produto : produtosPrimeiroPedido) {
				if (produto.getPedidos() == null) {
					produto.setPedidos(new ArrayList<>());
				}
				produto.getPedidos().add(primeiroPedido);
			}

			// Associando outros produtos ao segundo pedido
			List<Produto> produtosSegundoPedido = new ArrayList<>();
			produtosSegundoPedido.add(todosProdutos.get(1)); // Tablet
			produtosSegundoPedido.add(todosProdutos.get(5)); // Monitor
			produtosSegundoPedido.add(todosProdutos.get(7)); // Cadeira

			// Associar produtos ao pedido
			segundoPedido.setProdutos(produtosSegundoPedido);

			// Também adicionamos a referência do pedido em cada produto
			for (Produto produto : produtosSegundoPedido) {
				if (produto.getPedidos() == null) {
					produto.setPedidos(new ArrayList<>());
				}
				produto.getPedidos().add(segundoPedido);
			}

			// Salvando as alterações
			produtoRepository.saveAll(todosProdutos);
			pedidoRepository.saveAll(todosPedidos);

			// Exibindo os pedidos e seus produtos
			System.out.println("\n=== Listando pedidos e seus produtos ===");
			pedidoRepository.findAll().forEach(pedido -> {
				System.out.println("\nPedido ID: " + pedido.getId() + " - Data: " + pedido.getData());
				System.out.println("Produtos:");
				pedido.getProdutos().forEach(produto ->
						System.out.println(" - " + produto.getNome() + " (R$ " + produto.getPreco() + ")"));
			});
		} else {
			System.out.println("Não há produtos ou pedidos suficientes para associação.");
		}

		// FIM DO CÓDIGO PARA ASSOCIAÇÃO DE PRODUTOS E PEDIDOS
	}

	public static Optional<Integer> processaNumero(Optional<Integer> numero) {
		return numero.filter(n -> n > 0).map(n -> n * n).or(() -> Optional.of(0));
	}

	public static String obterPrimeiroEUltimoNome(String nomeCompleto) {
		String[] nomes = nomeCompleto.trim().split("\\s+");
		if (nomes.length == 1) {
			return nomes[0]; // Apenas um nome
		}
		return nomes[0] + " " + nomes[nomes.length - 1]; // Primeiro e último
	}

	public static List<String> normalizeEmails(List<String> emails) {
		return emails.stream()
				.map(email -> email.trim().toLowerCase())
				.collect(Collectors.toList());
	}
}