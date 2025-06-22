package com.faleite.cursojava.aula63;

public class ExemploPrintf {

    public static void main(String[] args) {

        System.out.printf("Hello %s", "Olá, Mundo");
        System.out.printf("\n");
        System.out.printf("%S", "Olá, Mundo");
        System.out.printf("\n");

        System.out.printf("%c", 'c'); // out: c
        System.out.printf("%n"); // Quebra de linha
        System.out.printf("%C", 'c'); // out: C

        System.out.printf("%n");

        int valor = 123456789;
        System.out.printf("%d", valor);
        System.out.printf("%n");

        double pontoFlutuante = 3.1456789;
        System.out.printf("%f", pontoFlutuante);

        System.out.printf("%n");
        String olaMundo = "Olá Mundo!";
        System.out.printf("%20s", olaMundo); // out:          Olá Mundo!

        System.out.printf("%n");
        System.out.printf("%-20s", olaMundo); // out: Olá Mundo!          :<-(alinhamento a esquerda)


        System.out.printf("%n");
        System.out.printf("%+d", valor); // +123456789

        System.out.printf("%n");
        System.out.printf("%015d", valor); // 000000123456789

        System.out.printf("%n");
        System.out.printf("%,d", valor); // 123,456,789

        int valor2 = -123456789;
        System.out.printf("%n");
        System.out.printf("% d", valor2); // -123456789

        System.out.printf("%n");
        System.out.printf("%.3f", pontoFlutuante); // 3.146

        System.out.printf("%n");
        System.out.printf("£%10.2f", pontoFlutuante); // £      3.15

        System.out.printf("%n");
        testeMaisCompleto();
    }

    private static void testeMaisCompleto(){

        double[] precos = {1000, 123.54, 7843.567, 1, 4.56789};

        for (int i = 0; i < precos.length; i++){
            System.out.printf("%s %02d: total de £%,10.2f%n", "Item", i+1, precos[i]);
        }

        /* Out:
        * Item 01: total de £  1,000.00
        * Item 02: total de £    123.54
        * Item 03: total de £  7,843.57
        * Item 04: total de £      1.00
        * Item 05: total de £      4.57
        * */

        //Java.util.Formater
    }
}
