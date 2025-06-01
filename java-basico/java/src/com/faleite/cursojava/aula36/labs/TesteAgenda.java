package com.faleite.cursojava.aula36.labs;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome da agenda: ");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < contatos.length; i++) {
            System.out.println("Entre com as informações do contato " + (i + 1) + ": ");
            Contato c = new Contato();

            System.out.println("Nome: ");
            nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Telefone: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Email: ");
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }

        /*contatos[0] = new Contato();
        contatos[0].setNome("Fabricio");
        contatos[0].setTelefone("1111");
        contatos[0].setEmail("dkdkd");*/

        agenda.setContatos(contatos);

        if (agenda != null){
            System.out.println(agenda.getAgenda());
        }
    }
}
