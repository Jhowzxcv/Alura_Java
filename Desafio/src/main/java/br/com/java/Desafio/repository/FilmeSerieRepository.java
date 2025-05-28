package br.com.java.Desafio.repository;

import br.com.java.Desafio.models.FilmeSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeSerieRepository extends JpaRepository<FilmeSerie, Long> {

    @Query(value = "SELECT * FROM filmes_series ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    FilmeSerie obtemFilmeOuSerieAleatorio();
}
