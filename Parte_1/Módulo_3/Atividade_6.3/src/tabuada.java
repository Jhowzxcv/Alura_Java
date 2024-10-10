import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = leitura.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + "X" + i + " =" + numero * i);
        }
    }
}