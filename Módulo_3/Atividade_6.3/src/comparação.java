import java.util.Scanner;

public class comparação {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite dois números");
        System.out.println("Primeiro numero: ");
        int numero1 = leitura.nextInt();

        System.out.println("Segundo numero: ");
        int numero2 = leitura.nextInt();

        if ( numero1 == numero2) {
            System.out.println("Os numeros sao iguais");
        }

        else {
            System.out.println("Os numeros sao diferentes");

            if (numero1 > numero2) {
                System.out.println("O primeiro numero é maior");
            }

             else {
                System.out.println("O segundo numero é maior");
            }
        }

    }

}
