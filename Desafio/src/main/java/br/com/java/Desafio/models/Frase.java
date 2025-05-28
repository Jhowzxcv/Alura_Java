package br.com.java.Desafio.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Frases")
public class Frase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String texto;

    @ManyToOne
    @JoinColumn(name = "personagem_id")
    private Personagem personagem;

    public Long getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public Personagem getPersonagem() {
        return personagem;
    }
}






// id: Identificador único da frase.
//texto: O texto da frase.
//personagem: Referência ao personagem que disse a frase.
//titulo: O título do filme ou série ao qual a frase pertence.
//poster: URL ou caminho da imagem do pôster do filme ou série.