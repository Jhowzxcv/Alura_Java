import java.util.Scanner;

public class pos_neg {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = leitura.nextInt();

        if (numero > 0){
            System.out.println("seu número é positivo!");
        } else {
            System.out.println("seu número é negativo");
        }
    }
}