public class desconto {
    public static void main(String[] args) {
        double precoOriginal = 22.50;
        double percentualDesconto = 25;

        double precoFinal = precoOriginal - precoOriginal * (percentualDesconto/100);

        System.out.println(String.format("%.2f", precoFinal));
    }
}
