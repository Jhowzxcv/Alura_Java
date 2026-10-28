package br.com.alura.Atividades.postgres.repository;

import br.com.alura.Atividades.postgres.Pedido;
import br.com.alura.Atividades.postgres.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // 1 - Retorne todos os produtos com o nome exato fornecido.
    List<Produto> findByNome(String nome);

    // 2 - Retorne todos os produtos associados a uma categoria específica.
    List<Produto> findByCategoriaId(Long categoriaId);

    // 3 - Retorne produtos com preço maior que o valor fornecido.
    List<Produto> findByPrecoGreaterThan(BigDecimal preco);

    // 4 - Retorne produtos com preço menor que o valor fornecido.
    List<Produto> findByPrecoLessThan(BigDecimal preco);

    // 5 - Retorne produtos cujo nome contenha o termo especificado.
    List<Produto> findByNomeContaining(String termo);

    // 8 - Retorne produtos de uma categoria ordenados pelo preço de forma crescente.
    List<Produto> findByCategoriaIdOrderByPrecoAsc(Long categoriaId);

    // 9 - Retorne produtos de uma categoria ordenados pelo preço de forma decrescente.
    List<Produto> findByCategoriaIdOrderByPrecoDesc(Long categoriaId);

    // 10 - Retorne a contagem de produtos em uma categoria específica.
    long countByCategoriaId(Long categoriaId);

    // 11 - Retorne a contagem de produtos cujo preço seja maior que o valor fornecido.
    long countByPrecoGreaterThan(BigDecimal preco);

    // 12 - Retorne produtos com preço menor que o valor fornecido ou cujo nome contenha o termo especificado.
    List<Produto> findByPrecoLessThanOrNomeContaining(BigDecimal preco, String termo);

    // 16 - Retorne os três produtos mais caros.
    List<Produto> findTop3ByOrderByPrecoDesc();

    // 17 - Retorne os cinco produtos mais baratos de uma categoria.
    List<Produto> findTop5ByCategoriaIdOrderByPrecoAsc(Long categoriaId);

    // 18 - Retorne os produtos com preço maior que um valor.
    @Query("SELECT p FROM Produto p WHERE p.preco >= :valor")
    List<Produto> produtosComMaiorValor(double valor);

    // 19 - Retorne os produtos em ordem crescente pelo valor
    @Query("SELECT p FROM Produto p ORDER BY p.preco")
    List<Produto> produtosCrescente();

    // 20 - Retorne os produtos em ordem decrescente pelo valor
    @Query("SELECT p FROM Produto p ORDER BY p.preco DESC")
    List<Produto> produtosDecrescente();

    // 23 - Retorne a Média do valor dos produtos
    @Query("SELECT AVG(p.preco) FROM Produto p")
    double calcularMedia();

    //24 - Retorne o produto mais caro de uma categoria
    @Query("SELECT MAX(p.preco) FROM Produto p WHERE p.categoria.nome = :categoria")
    double precoMax(String categoria);

    //25 - Retorne o numero de produtos em cada categoria
    @Query("SELECT c.nome, COUNT(p) FROM Produto p JOIN p.categoria c GROUP BY c.nome")
    List<Object[]> contarProdutosPorCategoria();

    //27 - Retorne produtos buscados por nome ou categoria
    @Query("SELECT p FROM Produto p WHERE(:nome is NULL OR p.nome = :nome) AND (:categoria is NULL OR p.categoria.nome = :categoria)")
    List<Produto> produtosPorNomeOuCategoria(String nome, String categoria);

    //28 - Retorne os produtos mais caros com busca nativa
    @Query(value = "SELECT * FROM produto ORDER BY valor DESC LIMIT 5", nativeQuery = true)
    List<Produto> buscarTop5ProdutosMaisCaros();






}