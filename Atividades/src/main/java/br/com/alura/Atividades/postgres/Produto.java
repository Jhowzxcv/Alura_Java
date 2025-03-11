package br.com.alura.Atividades.postgres;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false )
    private String nome;

    @Column(name = "valor")
    private Double preco;

    // Construtor padrão necessário para JPA
    public Produto() {
    }

    // Construtor com parâmetros
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
}
