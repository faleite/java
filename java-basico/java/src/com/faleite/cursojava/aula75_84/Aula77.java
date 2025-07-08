package com.faleite.cursojava.aula75_84;

import java.util.Arrays;

public class Aula77 {

    public static void main(String[] args) {

        String java = "Java";

        for (int i = 0; i < java.length(); i++){
            System.out.println(java.charAt(i));
            /* out:
                    J
                    a
                    v
                    a
            */
        }

        char[] jav = new char[3];
        // argumentos do getChars: inicio, fim, destino, indice do destino
        java.getChars(0, 3, jav, 0);
        System.out.println(jav); // out: jav

        // Seria o mesmo que:
        for (int i = 0, j = 0; i < 3; i++, j++){
            jav[j] = java.charAt(i);
        }
        System.out.println(jav); // out: jav

        byte[] javBytes = new byte[3];
        java.getBytes(0, 3, javBytes, 0);
        System.out.println(Arrays.toString(javBytes)); // out: [74, 97, 118]
        System.out.println(javBytes); // out: [B@7b23ec81

        char[] javaChars = java.toCharArray();
        System.out.println(javaChars); // Java
    }
}