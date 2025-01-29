package atividades;

public class Aluno {
    private String nome;
    private int idade;
    private double somaDasNotas;
    private int totalDeNotas;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    String exibeInformacoes(){
        return "Nome: " + nome + ", idade: " + idade;
    }

    public void guardaNotas(double notas) {
        somaDasNotas += notas;
        totalDeNotas++;
    }

    public Double calcularMedia(){
        return somaDasNotas / totalDeNotas;
    }
}
