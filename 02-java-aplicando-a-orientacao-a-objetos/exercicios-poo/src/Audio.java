package atividades;

public class Audio {
    protected String titulo;
    protected int duracaoEmMinutos;
    protected int totalDeReproducoes;
    protected int curtidas;
    protected double classificacao;

    public Audio(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.totalDeReproducoes = 0;
        this.curtidas = 0;
        this.classificacao = 0.0;
    }


    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public String reproduzir(){
        return "Audio reproduzido!";
    };

    public void curtir(){
        curtidas++;
    }

    public String ExibirInformacoes(){
        return "Titulo: " + titulo +
                "Duração: " + duracaoEmMinutos + " minutos" +
                "Reproduções: " + totalDeReproducoes +
                "Curtidas: " + curtidas;
    };

}
