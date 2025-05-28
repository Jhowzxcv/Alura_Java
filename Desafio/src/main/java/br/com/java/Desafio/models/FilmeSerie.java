package br.com.java.Desafio.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "filmes_series")
public class FilmeSerie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String titulo;

    @OneToMany(mappedBy = "filmeSerie", cascade = CascadeType.ALL)
    private List<Personagem> personagens;

    private String poster;

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public String getPoster() {
        return poster;
    }
}



