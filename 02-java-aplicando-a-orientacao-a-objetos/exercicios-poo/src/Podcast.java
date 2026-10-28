package atividades;

public class Podcast extends Audio{
    private String tema;
    private String apresentador;

    public Podcast(String titulo, int duracaoEmMinutos, String tema, String apresentador) {
        super(titulo, duracaoEmMinutos);
        this.tema = tema;
        this.apresentador = apresentador;

    }
}
