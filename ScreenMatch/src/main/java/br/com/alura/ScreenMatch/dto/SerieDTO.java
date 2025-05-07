package br.com.alura.ScreenMatch.dto;

import br.com.alura.ScreenMatch.model.Categoria;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public record SerieDTO(Long id,
                       String titulo,
                       Integer totalTemporadas,
                       Double avaliacao,
                       @Enumerated(EnumType.STRING)
                       Categoria genero,
                       String atores,
                       String urlPoster,
                       String sinopse) {
}
