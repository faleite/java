package com.faleite.cursojava.aula20;

import java.util.Scanner;

public class Ex04 {
    public static boolean checkDay(byte day){
        return day >= 1 && day <= 31;
    }

    public static boolean checkHour(byte hour){
        return hour >= 0 && hour <= 23;
    }

    public static void main(String[] args) {
        String[][] agenda = new String[31][24];
        Scanner scan = new Scanner(System.in);
        boolean getOut = false;

        while (!getOut) {
            byte option = 0;
            byte day = 0;
            byte hour = -1;

            System.out.println("Digite 1 para agendar compromisso");
            System.out.println("Digite 2 para consultar agenda");
            System.out.println("Digite 3 para sair");

            option = scan.nextByte();

            switch (option) {
                case 1: {
                    System.out.println("Informe o compromisso:");
                    String string = scan.next();
                    if (!string.isEmpty()){
                        while (!checkDay(day)){
                            System.out.println("Digite um dia válido: (dias são de 1 a 31)");
                            day = scan.nextByte();
                        }
                        while (!checkHour(hour)){
                            System.out.println("Digite um hora válida: (0 a 23)");
                            hour = scan.nextByte();
                        }
                        agenda[--day][hour] = string;
                    }
                    break;
                }
                case 2: {
                    while (!checkDay(day)){
                        System.out.println("Digite um dia válido: (dias são de 1 a 31)");
                        day = scan.nextByte();
                    }
                    while (!checkHour(hour)){
                        System.out.println("Digite um hora válida: (0 a 23)");
                        hour = scan.nextByte();
                    }
                    System.out.println(agenda[--day][hour]);
                    break;
                }
                case 3:
                    getOut = true;
                    break;
                default:
                    System.out.println("Dados invalidos");
            }
        }
    }
}
