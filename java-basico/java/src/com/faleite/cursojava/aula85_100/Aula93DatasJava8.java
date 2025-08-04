package com.faleite.cursojava.aula85_100;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93DatasJava8 {

    public static void main(String[] args) {

        // Data (dd MM yyyy)
        // Padrão ISO
        LocalDate agora = LocalDate.now();
        System.out.println(agora); // 2025-08-04

        System.out.println(LocalDate.of(2025, 8, 4)); // 2025-08-04

        // Caso o argumento seja invalido, lançarara um exception
        // Importante usar try-catch para validação
        System.out.println(LocalDate.parse("2025-08-04")); // 2025-08-04

        // Avançar/Retroceder dias
        System.out.println(agora.plusDays(30)); // 2025-09-03
        System.out.println(agora.minusDays(30)); // 2025-07-05

        // Diminui 1 mês
        System.out.println(agora.minus(1, ChronoUnit.MONTHS)); // 2025-07-04

        System.out.println(agora.getDayOfWeek()); // MONDAY
        System.out.println(agora.getDayOfMonth()); // 4
        System.out.println(agora.getDayOfYear()); // 216

        System.out.println(LocalDate.parse("2020-02-01").isLeapYear()); // true


        // Horario
        LocalTime hAgora = LocalTime.now();
        System.out.println(hAgora); // 18:40:10.789013323

        System.out.println(LocalTime.of(20, 18)); // 20:18
        System.out.println(LocalTime.parse("20:18")); // 20:18

        System.out.println(hAgora.plusMinutes(60)); // 19:40:10.789013323
        System.out.println(hAgora.minus(40, ChronoUnit.MINUTES)); // 18:03:00.444953073

        System.out.println(hAgora.getHour()); // 18

        // Data completa: data + hora
        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto); // 2025-08-04T18:47:49.636619357
        System.out.println(LocalDateTime.of(2025, 8, 4, 18, 45)); // 2025-08-04T18:45
        System.out.println(LocalDateTime.parse("2025-08-04T18:45:00")); // 2025-08-04T18:45
        System.out.println(agoraCompleto.plusYears(20)); // 2045-08-04T18:47:49.636619357


        // Time Zone - ZoneId
        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso); // Europe/Lisbon

        Set<String> fusos = ZoneId.getAvailableZoneIds();
        for (String f : fusos){
            /*
            Asia/Aden
            America/Cuiaba
            Etc/GMT+9
            Etc/GMT+8
            Africa/Nairobi
            America/Marigot
            Asia/Aqtau
            Pacific/Kwajalein
            America/El_Salvador
            Asia/Pontianak
            Africa/Cairo
            ... cuntinued
            * */
            System.out.println(f);
        }

        ZoneId sp = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2025-08-04T18:45:00"), sp);
        System.out.println(zdt); // 2025-08-04T18:45-03:00[America/Sao_Paulo]
        System.out.println(ZonedDateTime.parse("2025-08-04T18:45-03:00[America/Sao_Paulo]")); // 2025-08-04T18:45-03:00[America/Sao_Paulo]

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);
        System.out.println(offsetdt); // 2025-08-04T19:03:32.932468105+02:00

        Date date = new Date();
        Calendar c = Calendar.getInstance();
        LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
        System.out.println(ldtDate); // 2025-08-04T15:06:37.451
        System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp)); // 2025-08-04T15:06:37.456


    }
}
