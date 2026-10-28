import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double saldo = 2500.00;
        double valor;
        int operacao;


        System.out.println("""
                *************************************
                Dados iniciais do cliente:
                
                Nome:           Jacqueline Oliveira 
                Tipo conta:     Corrente
                Saldo inicial:  R$ 2500,00
                *************************************
                """);
        while (true) {
            System.out.println("""       
                    Operações
                    
                    1-  Consultar saldos
                    2-  Receber valor
                    3-  Transferir valor
                    4-  Sair
                    
                    Digite a opção desejada:
                    """);
            operacao = leitura.nextInt();

            switch (operacao) {

                case 1:

                    break;

                case 2:
                    System.out.println("Informe o valor a receber");
                    valor = leitura.nextDouble();
                    saldo += valor;
                    break;

                case 3:
                    System.out.println("\nInforme o valor que deseja tranferir");
                    valor = leitura.nextDouble();
                    if (valor > saldo) {
                        System.out.println("\nNão há saldo suficiente para fazer essa tranferência");
                    } else {
                        saldo -= valor;
                    }
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Opção invalida!");
                    break;


            }
            if (operacao != 4) {
                System.out.println("\nSaldo atual: " + saldo + "\n");
            }
        }
    }
}