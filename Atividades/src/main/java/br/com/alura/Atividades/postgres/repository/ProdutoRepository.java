package br.com.alura.Atividades.postgres.repository;

import br.com.alura.Atividades.postgres.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
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
}