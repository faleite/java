package com.faleite.cursojava.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95ResourceBundle {

    public static void main(String[] args) {
        System.out.println("Locale atual " + Locale.getDefault()); // en_US
        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");

        // Pegou do file: meu-texto.properties
        System.out.println("Hello EN: " + rb.getString("hello"));
        System.out.println("Mundo EN: " + rb.getString("world"));

        // Locale.setDefault(new Locale("pt_BR", "pt_BR"));
        rb = ResourceBundle.getBundle("meu-texto", new Locale("pt", "BR"));

        // Pegou do file: meu-texto_pt_BR.properties
        System.out.println("Olá pt_BR: " + rb.getString("hello"));
        System.out.println("Mundo pt_BR: " + rb.getString("world"));
    }
}
