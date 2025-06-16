package com.faleite.cursojava.aula54;

public class Formulario {

    enum Genero {
        FEMINIO('F'), MASCULINO('M');

        private char valor;

        Genero(char valor) {
            this.valor = valor;
        }
    }

    private String nome;
    private Genero genero;

}
