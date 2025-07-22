package com.faleite.cursojava.aula85_100;

import java.util.Calendar;

public class Aula87Calendar {

    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance(); // Padrão "singleton"

        System.out.println(hoje);
        /* OUTPUT
        * java.util.GregorianCalendar[time=1753217457661,areFieldsSet=true,
        * areAllFieldsSet=true,lenient=true,
        * zone=sun.util.calendar.ZoneInfo[id="Europe/Lisbon",offset=0,
        * dstSavings=3600000,useDaylight=true,transitions=351,
        * lastRule=java.util.SimpleTimeZone[id=Europe/Lisbon,offset=0,
        * dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,
        * startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,
        * startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,
        * endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,
        * minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=6,
        * WEEK_OF_YEAR=30,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,
        * DAY_OF_YEAR=203,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,
        * AM_PM=1,HOUR=9,HOUR_OF_DAY=21,MINUTE=50,SECOND=57,
        * MILLISECOND=661,ZONE_OFFSET=0,DST_OFFSET=3600000]
        * */

        int ano = hoje.get(Calendar.YEAR);
        System.out.println(ano); // 2025

        int mes = hoje.get(Calendar.MONTH);
        System.out.println(mes); // 6 (Janeiro = 0)

        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        System.out.println(dia); // 22

        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        System.out.println(hora); // 21

        int minuto = hoje.get(Calendar.MINUTE);
        System.out.println(minuto); // 59

        int segundo = hoje.get(Calendar.SECOND);
        System.out.println(segundo); // 51

        System.out.println(Calendar.JANUARY); // 0

        // System.out.printf("Hoje é dia %d do mês %d, do ano de %d", dia, (mes+1), ano);
        System.out.printf("Hoje é %02d/%02d/%d %02d:%02d:%02d",
                dia, (mes+1), ano, hora, minuto, segundo); // Hoje é 22/07/2025 22:09:10

        hoje.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println();
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH)); // 27

        hoje.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println();
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH)); // 26

    }
}
