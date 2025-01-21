package br.com.alura.screenmatch.execao;

public class SenhaInvalidaException extends RuntimeException {
  private String mensagem;


  public SenhaInvalidaException(String mensagem) {
    this.mensagem = mensagem;
  }

  public String getMensagem() {
    return this.mensagem;
  }
}

