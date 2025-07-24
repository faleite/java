package com.faleite.cursojava.aula85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        TimeZone tz = calendar.getTimeZone();

        System.out.println(tz); // Europe/Lisbon ...

        // Pegar fusos que existem no Java
        /*String[] fusos = TimeZone.getAvailableIDs();
        for (String fuso : fusos) {
            System.out.println(fuso);
        }*/

        TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");
        System.out.println(tzSP.getDisplayName()); // Brasilia Standard Time
        System.out.println(tzSP.getID()); // America/Sao_Paulo

        Calendar agora = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
        System.out.println(sdf.format(agora.getTime())); // 24-Jul-2025 07:58:59 PM WEST

        Calendar agoraSP = Calendar.getInstance(tzSP);
        System.out.println(agoraSP.getTimeZone()); // sun.util.calendar.ZoneInfo[id="America/Sao_Paulo",
        // offset=-10800000,dstSavings=0,useDaylight=false,transitions=93,lastRule=null]
        System.out.println(sdf.format(agoraSP.getTime())); // 24-Jul-2025 08:00:56 PM WEST

        agoraSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset(System.currentTimeMillis()) / 1000  / 60 / 60);
        System.out.println(sdf.format(agoraSP.getTime())); // 24-Jul-2025 05:08:39 PM WEST
    }
}
