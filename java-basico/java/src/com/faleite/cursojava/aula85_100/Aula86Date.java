package com.faleite.cursojava.aula85_100;

import java.util.Date;

public class Aula86Date {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(hoje); // Mon Jul 14 21:02:24 WEST 2025

        // Muito utilizado: retorna a quantidade de milesegundos desde 1 Jan 1970
        System.out.println("Milesegundos desde 1 Jan 1970: " + hoje.getTime());
        // Milesegundos desde 1 Jan 1970: 1752523474516

        // Pega o dia do mês:  "Depreciado"
        System.out.println(hoje.getDate()); // 14

    }
}
