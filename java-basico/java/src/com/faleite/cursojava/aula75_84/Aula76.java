package com.faleite.cursojava.aula75_84;

public class Aula76 {

    public static void main(String[] args) {

        String curso = "Curso ";
        String java = "Java";

        String cursoJava = curso + java;
        System.out.println(cursoJava); // out: Curso Java

        String resultado2com2 = "Resultado 2+2 = " + (2+2);
        System.out.println(resultado2com2); // out: Resultado 2+2 = 4

        String resultado2com2_ = "Resultado 2+2 = " + 2 + 2;
        System.out.println(resultado2com2_); // out: Resultado 2+2 = 22

        String um = String.valueOf(1);
        System.out.println(um); // out: 1

    }
}
