package com.faleite.cursojava.aula75_84;

public class Aula83 {

    public static void main(String[] args) {

        String[] letras = {"B", "C", "D", "E", "F"};

        String alfabeto = "";

        // Forma mais simples de concatenação

        for (String letra : letras){
            alfabeto += letra;
        }
        System.out.println(alfabeto); // BCDEF

        //************************************//

        StringBuffer sb = new StringBuffer(); // pode se passar a capacidade em bytes
        for (String letra : letras){
            sb.append(letra);
        }
        // System.out.println(sb);
        // alfabeto = sb.toString();
        alfabeto = new String(sb);
        System.out.println(alfabeto);

        System.out.println(sb.reverse());

        //*************************************//

        StringBuilder sb_ = new StringBuilder(); // pode se passar a capacidade em bytes
        for (String letra : letras){
            sb_.append(letra);
        }
        // System.out.println(sb);
        // alfabeto = sb.toString();
        alfabeto = new String(sb_);
        System.out.println(alfabeto);

        System.out.println(sb_.reverse());
    }
}