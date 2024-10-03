public class condicional {
    public static void main(String[] args) {
        int anoDeLançamento = 1990;
        boolean incluidoNoPlano = true;
        double NotaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLançamento >= 2022){
            System.out.println("Lançamento que os clientes estaão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if ( incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}