package com.faleite.cursojava.aula75_84;

public class Aula80 {

    public static void main(String[] args) {

        String teste = "Isto é um teste.";

        System.out.println(teste); // Isto é um teste.
        System.out.println(teste.substring(10, 15)); // teste

        String ola = "olá";
        String mundo = " mundo";

        // Mesmo que (ola + mundo)
        String olaMundo = ola.concat(mundo);
        System.out.println(olaMundo); // olá mundo

        String espacos = "i s p a ç o";
        String semEspacos = espacos.replace('i', 'e');
        System.out.println(semEspacos); // e s p a ç o

        semEspacos = semEspacos.replaceAll(" ", "");
        System.out.println(semEspacos); // espaço

        String nome = " meu nome é: ";
        System.out.println(nome); // [ meu nome é: ]
        System.out.println(nome.trim()); // [meu nome é:]

        // web services
        // xml

    }
}