import java.util.Random;
import java.util.Scanner;

public class adivinhação {
    public static void main(String[] args) {
        int ramdomizar = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);

        String nome;
        int idade;
        int numero = ramdomizar;
        int tentativa;

        //System.out.println(numero);

        System.out.println("digite seus dados");
        System.out.println("Nome: ");
        nome = leitura.nextLine();
        System.out.println("Idade: ");
        idade = leitura.nextInt();


        System.out.println("Tente acertar o numero gerado em 5 tentativas");

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número:");
            tentativa = leitura.nextInt();

            if (tentativa == numero){
                System.out.println("Resposta correta!");
                break;
            } else if (i < 4){
                System.out.println("Resposta errada, tente novamente!");
            } else {
                System.out.println("Resposta errada, acabou as tentativas");
            }
        }

    }
}