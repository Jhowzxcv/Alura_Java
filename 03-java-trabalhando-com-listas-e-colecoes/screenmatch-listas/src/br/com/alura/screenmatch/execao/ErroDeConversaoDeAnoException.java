package br.com.alura.screenmatch.execao;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;


    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}


