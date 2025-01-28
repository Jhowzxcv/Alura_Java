public class Musica {
    String nome;
    String artista;
    int anoDeLancamento;
    double somaDasAvaliacoes;
    double totalDeAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Nome da musica: " + nome);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return totalDeAvaliacoes / somaDasAvaliacoes;
    }
}
