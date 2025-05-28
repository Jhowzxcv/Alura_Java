package br.com.java.Desafio.repository;

import br.com.java.Desafio.models.FilmeSerie;
import br.com.java.Desafio.models.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Long> {

    @Query(value = "SELECT * FROM personagens WHERE filme_serie_id = :id ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Personagem obtemPersonagemAleatorioPorFilmeOuSerie(@Param("id") Long id);

}
