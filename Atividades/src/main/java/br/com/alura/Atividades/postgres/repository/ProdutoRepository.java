package br.com.alura.Atividades.postgres.repository;

import br.com.alura.Atividades.postgres.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Interface básica sem métodos personalizados
}