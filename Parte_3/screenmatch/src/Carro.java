public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println("Modelo do veículo: " + modelo);
        System.out.println("Ano do veículo: " + ano);
        System.out.println("Cor do veículo: " + cor);
    }

    int idade(int anoAtual){
        return anoAtual - ano;
    }
}
