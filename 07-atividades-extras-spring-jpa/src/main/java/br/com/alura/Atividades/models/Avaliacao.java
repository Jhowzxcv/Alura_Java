package br.com.alura.Atividades.models;

import java.util.List;

public class Avaliacao<T> {

    private T tipo;
    private int nota;
    private String comentario;

    public Avaliacao(T tipo, int nota, String comentario) {
        this.tipo = tipo;
        this.nota = nota;
        this.comentario = comentario;
    }

    public T getTipo() {
        return tipo;
    }

    public void setTipo(T tipo) {
        this.tipo = tipo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public static <T> double calcularMedia(List<Avaliacao<T>> avaliacoes) {
        double quantidadeDeAvaliacoes = 0;
        for (Avaliacao avaliacao : avaliacoes){
            quantidadeDeAvaliacoes += avaliacao.getNota();
        }
        return quantidadeDeAvaliacoes / avaliacoes.size();
    }
}
