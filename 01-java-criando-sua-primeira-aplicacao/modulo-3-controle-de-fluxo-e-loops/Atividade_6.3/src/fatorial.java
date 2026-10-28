import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite um número:");
        int numero = leitura.nextInt();

        int fator = numero;

        for (int i = 1; i < numero; i++) {
            fator *= i;

        }
        System.out.println(numero + "! é " + fator);
    }
}