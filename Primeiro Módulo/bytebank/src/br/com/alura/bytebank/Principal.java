package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao bytebank");
        new Funcionario("joao", 1, "12/02/19");
    }
}
