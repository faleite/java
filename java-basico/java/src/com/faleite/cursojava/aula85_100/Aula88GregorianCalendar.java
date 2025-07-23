package com.faleite.cursojava.aula85_100;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GregorianCalendar {

    public static void main(String[] args) {

        Calendar hoje1 = Calendar.getInstance();

        // Estende a classe Calendar
        GregorianCalendar hoje = new GregorianCalendar();

        // System.out.println(hoje);
        /* OUTPUT
        * java.util.GregorianCalendar[time=1753296898989,areFieldsSet=true,
        * areAllFieldsSet=true,lenient=true,
        * zone=sun.util.calendar.ZoneInfo[id="Europe/Lisbon",offset=0,
        * dstSavings=3600000,useDaylight=true,transitions=351,
        * lastRule=java.util.SimpleTimeZone[id=Europe/Lisbon,
        * offset=0,dstSavings=3600000,useDaylight=true,startYear=0,
        * startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,
        * startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,
        * endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],
        * firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,
        * MONTH=6,WEEK_OF_YEAR=30,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,
        * DAY_OF_YEAR=204,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,
        * AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=54,SECOND=58,
        * MILLISECOND=989,ZONE_OFFSET=0,DST_OFFSET=3600000]
        * */

        imprimirData(hoje); // Hoje é 23/07/2025 19:59:32

        System.out.println(hoje.isLeapYear(2028)); // true

        GregorianCalendar hoje2 = new GregorianCalendar(2025, 0, 1);
        imprimirData(hoje2); // Hoje é 01/01/2025 00:00:00

        GregorianCalendar hoje3 = new GregorianCalendar(2025, 0, 1, 20, 05, 42);
        imprimirData(hoje3); // Hoje é 01/01/2025 20:05:42

    }

    private static void imprimirData(Calendar hoje) {
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minuto = hoje.get(Calendar.MINUTE);
        int segundo = hoje.get(Calendar.SECOND);

        System.out.printf("Hoje é %02d/%02d/%d %02d:%02d:%02d\n",
                dia, (mes+1), ano, hora, minuto, segundo);
    }
}
