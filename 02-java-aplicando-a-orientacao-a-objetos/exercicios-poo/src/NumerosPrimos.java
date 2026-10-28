package atividades;

public class NumerosPrimos {
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) return false; // Números menores ou iguais a 1 não são primos
        if (numero == 2 || numero == 3) return true; // 2 e 3 são primos
        if (numero % 2 == 0 || numero % 3 == 0) return false; // Elimina múltiplos de 2 e 3

        // Testa divisores de 5 até a raiz quadrada do número
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false; // Se for divisível, não é primo
            }
        }

        return true; // Se não encontrou divisores, é primo
    }


}
