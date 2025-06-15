package com.faleite.cursojava.aula52.labs;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda(2);

        /*Agenda agenda = new Agenda();
        Contato[] contatos = new Contato[2];
        agenda.adicionarContatos(contatos);*/

        boolean isOn = true;

        System.out.println("*+**+*+*+*+ AGENDA TELEFONICA *+*+*+*+*+");

        while (isOn){
            System.out.println("Digite:\n1 -> Para consultar um contato");
            System.out.println("2 -> Para adicionar um contato");
            System.out.println("3 -> Para sair");

            String opcao = scan.nextLine();

            try {
                switch (opcao) {

                    case "1": {

                        System.out.println("Digite o Nome ou ID do contato: ");
                        String busca = scan.nextLine();
                        try {
                            if (!agenda.consultaContato(busca)){
                                throw new ContatoNaoExisteException(busca);
                            }
                        }
                        catch (ContatoNaoExisteException e){
                            //e.printStackTrace();
                            System.out.println("Contato \"" + busca + "\" não existe");
                        }
                        break;
                    }
                    case "2": {

                        System.out.println("Digite o nome: ");
                        String nome = scan.nextLine();
                        System.out.println("Digite o telefone: ");
                        String telefone = scan.nextLine();

                        try {
                            if (!agenda.adicionarContato(nome, telefone)){
                                throw new AgendaCheiaException(nome);
                            }
                        }
                        catch (AgendaCheiaException e){
                            System.out.println("Agenda cheia não foi possivel adicionar o contato de " + nome);
                            System.out.println(agenda);
                        }

                        break;
                    }
                    case "3": {
                        isOn = false;
                        break;
                    }
                    default:
                        throw new IllegalArgumentException("Opção inválida: " + opcao);
                }
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                //e.printStackTrace();
            }

        }
    }
}
