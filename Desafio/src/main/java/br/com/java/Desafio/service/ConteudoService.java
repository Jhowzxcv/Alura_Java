package br.com.java.Desafio.service;

import br.com.java.Desafio.DTO.ConteudoDTO;
import br.com.java.Desafio.models.FilmeSerie;
import br.com.java.Desafio.models.Frase;
import br.com.java.Desafio.models.Personagem;
import br.com.java.Desafio.repository.FilmeSerieRepository;
import br.com.java.Desafio.repository.FraseRepository;
import br.com.java.Desafio.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConteudoService {

    @Autowired
    private FilmeSerieRepository repositorioFilmeSerie;

    @Autowired
    private PersonagemRepository repositorioPersonagem;

    @Autowired
    private FraseRepository repositorioFrase;

    private ConteudoDTO converteDados(FilmeSerie filmeSerie, Personagem personagem, Frase frase) {
        return new ConteudoDTO(
                filmeSerie.getTitulo(),
                frase.getTexto(),
                personagem.getNome(),
                filmeSerie.getPoster()
        );
    }

    public ConteudoDTO obtemConteudo() {
        FilmeSerie filmeSerie = repositorioFilmeSerie.obtemFilmeOuSerieAleatorio();
        Personagem personagem = repositorioPersonagem.obtemPersonagemAleatorioPorFilmeOuSerie(filmeSerie.getId());
        Frase frase = repositorioFrase.obtemFraseAleatoriaPorPersonagem(personagem.getId());

        return converteDados(filmeSerie, personagem, frase);
    }
}

