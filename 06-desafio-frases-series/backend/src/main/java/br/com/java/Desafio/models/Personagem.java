package br.com.java.Desafio.models;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "Personagens")
public class Personagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nome;

    @OneToMany(mappedBy = "personagem", cascade = CascadeType.ALL)
    private List<Frase> frases;

    @ManyToOne
    @JoinColumn(name = "filmeSerie_id")
    private FilmeSerie filmeSerie;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public FilmeSerie getFilmeSerie() {
        return filmeSerie;
    }
}

