package atividades;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoeda implements ConversaoFinanceira {


    Gson gsonBuilder = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    double cotacaoDolar;



    public String pegaCotacao() throws IOException, InterruptedException {
        String endereco = "https://economia.awesomeapi.com.br/json/last/USD-BRL";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        AnalisaCotacao analisaCotacao = gsonBuilder.fromJson(json, AnalisaCotacao.class);
        cotacaoDolar = analisaCotacao.usdbrl().bid();
        return "cotação atual do dólar: " + cotacaoDolar;
    };

    @Override
    public String converterDolarParaReal(double dolar) {
        BigDecimal valorReais = new BigDecimal(dolar*cotacaoDolar);;
        BigDecimal valorArredondado = valorReais.setScale(2, RoundingMode.HALF_UP);
        return "Valor convertido: " + valorArredondado;
    }
}
