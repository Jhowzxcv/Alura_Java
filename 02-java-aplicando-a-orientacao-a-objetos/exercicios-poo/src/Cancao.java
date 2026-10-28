package atividades;

public class Cancao extends Audio{
    private String artista;
    private String genero;

    public Cancao(String titulo, int duracaoEmMinutos, String artista, String genero) {
        super(titulo, duracaoEmMinutos);
        this.artista = artista;
        this.genero = genero;
    }
}
