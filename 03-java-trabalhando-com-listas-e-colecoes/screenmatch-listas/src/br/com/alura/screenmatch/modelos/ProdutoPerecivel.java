package br.com.alura.screenmatch.modelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoPerecivel extends Produto {

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                ", Preço: " + this.getPreco() +
                ", Quantidade: " + this.getQuantidade() +
                ", Data de Validade: " + this.dataDeValidade;
    }

    private Date dataDeValidade;


    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataDeValidadeStr) {
        super(nome, preco, quantidade);


        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");  // Corrigido: use "MM" (para mês) ao invés de "mm" (para minutos)

        try {
            this.dataDeValidade = formato.parse(dataDeValidadeStr);
        } catch (ParseException e) {
            throw new RuntimeException("Erro ao converter a data", e);
        }
    }

    public Date getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(Date dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
