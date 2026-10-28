package br.com.alura.Atividades.postgres.repository;

import br.com.alura.Atividades.postgres.Pedido;
import br.com.alura.Atividades.postgres.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    // 6 - Retorne pedidos que ainda não possuem uma data de entrega.
    List<Pedido> findByDataIsNull();

    // 7 - Retorne pedidos com data de entrega preenchida.
    List<Pedido> findByDataIsNotNull();

    // 13 - Retorne pedidos feitos após uma data específica.
    List<Pedido> findByDataAfter(LocalDate data);

    // 14 - Retorne pedidos feitos antes de uma data específica.
    List<Pedido> findByDataBefore(LocalDate data);

    // 15 - Retorne pedidos feitos em um intervalo de datas.
    List<Pedido> findByDataBetween(LocalDate dataInicio, LocalDate dataFim);

    // 21 - Retorne os produtos que comecem com uma letra
    @Query("SELECT p FROM Produto p WHERE p.nome LIKE :letra%")
    List<Produto> produtoIniciadosPorLetra(@Param("letra") String letra);

    // 22 - Retorne os pedidos feitos entre duas datas
    @Query("SELECT p from Pedido p WHERE p.data BETWEEN :inicio AND :fim")
    List<Pedido> pedidosEntreDatas(LocalDate inicio, LocalDate fim);
}