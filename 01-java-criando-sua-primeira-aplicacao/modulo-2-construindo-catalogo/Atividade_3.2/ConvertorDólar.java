public class ConvertorDólar {
    public static void main(String[] args) {
        double valorEmDolares = 10;
        double reais = 4.94;
        double convertor = valorEmDolares * reais;

        System.out.println(String.format("%.2f reais", convertor));
    }
}
