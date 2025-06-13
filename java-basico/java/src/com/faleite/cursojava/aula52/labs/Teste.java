package com.faleite.cursojava.aula52.labs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda(2);

        System.out.println("*+**+*+*+*+ AGENDA TELEFONICA *+*+*+*+*+");
        System.out.println("Digite:\n1 -> Para consultar um contato");
        System.out.println("2 -> Para adicionar um contato");
        System.out.println("3 -> Para sair");

        int opcao = scan.nextInt();

        switch (opcao) {

            case 1:{
                System.out.println("Digite o Nome ou ID do contato: ");
                String busca = scan.nextLine();
                agenda.consultaContato(busca);
                break;
            }
            default:
                System.out.println("Trabalhando");
        }
    }
}
