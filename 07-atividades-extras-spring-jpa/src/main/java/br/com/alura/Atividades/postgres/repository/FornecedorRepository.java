package br.com.alura.Atividades.postgres.repository;

import br.com.alura.Atividades.postgres.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
    // Interface básica sem métodos personalizados
}