package br.com.alura.ScreenMatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService("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");


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