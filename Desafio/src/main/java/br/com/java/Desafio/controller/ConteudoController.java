package br.com.java.Desafio.controller;

import br.com.java.Desafio.DTO.ConteudoDTO;
import br.com.java.Desafio.service.ConteudoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConteudoController {
    @Autowired
    private ConteudoService servico;

    @GetMapping("/series/frases")
    public ConteudoDTO obtemConteudo() {
        return servico.obtemConteudo();
    }
}
