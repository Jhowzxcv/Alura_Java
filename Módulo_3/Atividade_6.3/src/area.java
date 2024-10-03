import java.util.Scanner;

public class area {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double area;


        System.out.println("Calcular a área do quadrado ou do circulo?: ");
        String resposta = leitura.nextLine();

        System.out.println("se for quadrado Digite seu comprimento ou altura: ");
        System.out.println("se for circulo digite seu raio: ");
        double medida = leitura.nextFloat();

        if ( resposta.equals("quadrado")) {
            area = medida * medida;
        }

        else {
            area = (Math.PI * Math.pow(medida, 2));
        }

        System.out.println("A area é " + area);
    }

}
