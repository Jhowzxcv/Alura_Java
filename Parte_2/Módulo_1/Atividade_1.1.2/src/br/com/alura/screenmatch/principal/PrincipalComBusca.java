package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.execao.ErroConsultaGitHubException;
import br.com.alura.screenmatch.execao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import br.com.alura.screenmatch.modelos.UsuarioGitHub;
import br.com.alura.screenmatch.modelos.Veiculo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";

        List<Titulo> titulos = new ArrayList<>();

        Gson gsonBuilder = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        while (true) {
            System.out.println("Digite um filme para busca");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=aa499394";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                TituloOmdb meuTituloOmdb = gsonBuilder.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);
                //try{
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo convertido:");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMensagem());
            }

        }

        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gsonBuilder.toJson(titulos));
        escrita.close();

        System.out.println("O programa finalizou corretamente");




        Gson gson = new Gson();

        /*String jsonAtividade = """
          {
            "nome" : "pedro",
            "cidade" : "sp"
          }
        """;

        Fulano pedro = gson.fromJson(jsonAtividade, Fulano.class);
        System.out.println(pedro);

        String jsonAtividade2 = """
                {
                  "titulo": "Java Para Iniciantes",
                  "autor": "João Silva",
                  "editora": {
                    "nome": "Tech Books",
                    "cidade": "São Paulo"
                  }
                }
                
                """;

        Livro livro = gson.fromJson(jsonAtividade2, Livro.class);
        System.out.println(livro);

    }
}

class Atividade1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um livro para busca");
        var busca = leitura.nextLine();

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca + "&key=AIzaSyCiVDcJG_cYheCOzNYxKh4h_aZF7VZzqck";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}

class Atividade2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma moeda para busca");
        var busca = leitura.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/coins/" + busca + "?x_cg_api_key=CG-s4SMDEp9cAfcZST1yqGnBiYT";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}

class Atividade3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a receita para busca");
        var busca = leitura.nextLine();

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + busca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}*/


        /*System.out.println("Digite o numero a ser dividido: ");
        double n1 = busca.nextInt();

        System.out.println("Digite o seu divisor");
        double n2 = busca.nextInt();

        double n3;
        try{
            n3 = n1 /n2;


            if (Double.isInfinite(n3)){
                throw new ArithmeticException("Resultado infinito!");
            }else {
                System.out.println(n3);
            }
        } catch (ArithmeticException e){
            System.out.println("nenhum numero pode ser dividido por zero");
        }



        try{
            System.out.println("Digite sua senha: ");
            String senha = busca.nextLine();

            if (senha.length() < 8){
                throw new SenhaInvalidaException("a senha deve conter pelo menos 8 caracteres");
            }

        }catch (SenhaInvalidaException e){
            System.out.println(e.getMensagem());
        }

        System.out.println("Digite o nome de usuario");
        var buscaGit = leitura.nextLine();

        String enderecoGit = "https://api.github.com/users/" + buscaGit.replace(" ", "+");
       try {
            HttpClient clientGit = HttpClient.newHttpClient();
            HttpRequest requestGit = HttpRequest.newBuilder()
                    .uri(URI.create(enderecoGit))
                    .build();
            HttpResponse<String> responseGit = clientGit
                    .send(requestGit, HttpResponse.BodyHandlers.ofString());

            String jsonGit = responseGit.body();

        Gson gsonGit = new Gson();

        UsuarioGitHub usuarioGitHub = gsonGit.fromJson(jsonGit, UsuarioGitHub.class);


        if (Objects.equals(usuarioGitHub.message(), "Not Found")){
            throw new ErroConsultaGitHubException("Usuario não encontrado, confira o nome");
        }else {
            System.out.println(jsonGit);
        }

       }catch (ErroConsultaGitHubException e){
           System.out.println(e.getMensagem());
       }*/

        Veiculo vectra = new Veiculo("Chevrolet", "Vectra", 2012);

        String jsonVeiculo = gson.toJson(vectra);

        System.out.println(jsonVeiculo);


    }
}
