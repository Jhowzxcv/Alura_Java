package br.com.java.Desafio.repository;

import br.com.java.Desafio.models.Frase;
import br.com.java.Desafio.models.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query(value = "SELECT * FROM frases WHERE personagem_id = :id ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Frase obtemFraseAleatoriaPorPersonagem(@Param("id") Long id);

}

