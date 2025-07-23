package com.faleite.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat("d/MM/y");
//        SimpleDateFormat sdf = new SimpleDateFormat("y");
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss Z");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss a z");

        Calendar data = new GregorianCalendar(2010, 2, 20, 14, 32, 25);

        System.out.println(sdf.format(data.getTime())); // 20-Mar-2010 14:32:25 PM WET

        Date hoje = new Date();

        System.out.println(sdf.format(hoje)); // 23-Jul-2025 20:22:59 PM WEST

        String d = sdf.format(hoje);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "20/02/200";

        try {
            Date minhDataEmDate = sdf1.parse(minhaData);

            System.out.println(minhDataEmDate); // Wed Feb 20 00:00:00 WET 200
            System.out.println(sdf.format(minhDataEmDate)); // 20-Feb-0200 00:00:00 AM WET
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
