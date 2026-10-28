package br.com.alura.ScreenMatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

import javax.management.PersistentMBean;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService(System.getenv("OPENAI_APIKEY"));


        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo")  // Modelo correto
                .prompt("Traduza para o português o texto: " + texto)
                .maxTokens(100)  // Ajuste de tokens, algo mais razoável
                .temperature(0.7)
                .build();

        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText().trim(); // .trim() para remover espaços extras

    }
}