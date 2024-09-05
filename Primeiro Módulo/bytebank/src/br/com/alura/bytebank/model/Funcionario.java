package br.com.alura.bytebank.model;

import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private int matricula;
    private LocalDate dataNascimento;

    public Funcionario(String nome, int matricula, String dataNascimento) {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
