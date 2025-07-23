package com.faleite.cursojava.aula85_100;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(hoje); // Wed Jul 23 20:33:08 WEST 2025

        System.out.println(Locale.getDefault()); // en_US


        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado); // 7/23/25, 8:39 PM

        Locale.setDefault(new Locale("pt", "Brazil"));

        hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado); // 23/07/2025 20:39

        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado); // 20:40:37

        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado); // 23 de jul. de 2025

        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println(hojeFormatado); // 23 de jul. de 2025 20:43:02

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado); // 20:43

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
        System.out.println(hojeFormatado); // 20:44:29

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
        System.out.println(hojeFormatado); // 20:44:29 WEST

        hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado); // 23/07/2025 20:46

        String data = "12/02/2017 14:25";
        try {
            Date dataDate = DateFormat.getInstance().parse(data);
            System.out.println(dataDate); // Sun Feb 12 14:25:00 WET 2017

            Calendar calendario = Calendar.getInstance();
            calendario.setTime(dataDate);
            System.out.println(calendario);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
