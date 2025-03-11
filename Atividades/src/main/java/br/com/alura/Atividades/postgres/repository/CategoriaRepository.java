package br.com.alura.Atividades.postgres.repository;

import br.com.alura.Atividades.postgres.Categoria;
import br.com.alura.Atividades.postgres.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    // Interface básica sem métodos personalizados
}