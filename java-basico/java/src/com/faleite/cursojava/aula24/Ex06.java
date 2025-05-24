package com.faleite.cursojava.aula24;

public class Ex06 {
    public static void main(String[] args) {
        Contato contato1 = new Contato();
        contato1.nome = "Joao";
        contato1.endereco = "Rua 1";
        contato1.email = "joao@email.com";

        contato1.telefones = new String[5];
        contato1.telefones[0] = "11111111";
        contato1.telefones[1] = "22222222";
        contato1.telefones[2] = "33333333";

        System.out.println("Nome: " + contato1.nome);
        System.out.println("Endereco: " + contato1.endereco);
        System.out.println("Email: " + contato1.email);
        System.out.println("Telefone: " + contato1.telefones[0]);
    }
}
