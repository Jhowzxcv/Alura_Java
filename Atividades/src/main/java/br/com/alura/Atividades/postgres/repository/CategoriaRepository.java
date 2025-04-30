package br.com.alura.Atividades.postgres.repository;

import br.com.alura.Atividades.postgres.Categoria;
import br.com.alura.Atividades.postgres.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Optional<Categoria> findByNome(String nome);
}