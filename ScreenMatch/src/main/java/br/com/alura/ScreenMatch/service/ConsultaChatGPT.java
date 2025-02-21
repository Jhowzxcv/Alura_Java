package br.com.alura.ScreenMatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService("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");

        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}
//