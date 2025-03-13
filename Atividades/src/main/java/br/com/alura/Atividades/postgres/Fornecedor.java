package br.com.alura.Atividades.postgres;

import jakarta.persistence.*;

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(unique = true, nullable = false)
    String nome;

    public Fornecedor() {}

    public Fornecedor(String nome) {
        this.nome = nome;
    }
}
