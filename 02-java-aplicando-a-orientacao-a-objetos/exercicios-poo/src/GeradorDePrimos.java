package atividades;

public class GeradorDePrimos extends NumerosPrimos{
    public static int proximoPrimo(int n) {
        int candidato = n + 1; // Começa no próximo número

        while (!ehPrimo(candidato)) { // Continua até achar um primo
            candidato++;
        }
        return candidato; // Retorna o próximo primo encontrado
    }
}
