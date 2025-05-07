package br.com.alura.ScreenMatch.controller;

import br.com.alura.ScreenMatch.dto.SerieDTO;
import br.com.alura.ScreenMatch.model.Serie;
import br.com.alura.ScreenMatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SerieController {

    @Autowired
    private SerieRepository repositorio;

    @GetMapping("/series")
    public List<SerieDTO> obterSeries() {
        return repositorio.findAll()
                .stream()
                .map(s -> new SerieDTO(s.getId(), s.getTitulo(), s.getTotalTemporadas(), s.getAvaliacao(), s.getGenero(), s.getAtores(), s.getUrlPoster(), s.getSinopse()))
                .collect(Collectors.toList());
    }
}
