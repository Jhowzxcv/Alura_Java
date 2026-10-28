package br.com.alura.screenmatch.execao;

public class ErroConsultaGitHubException extends RuntimeException {
  private String mensagem;


  public ErroConsultaGitHubException(String mensagem) {
    this.mensagem = mensagem;
  }

  public String getMensagem() {
    return this.mensagem;
  }
}

