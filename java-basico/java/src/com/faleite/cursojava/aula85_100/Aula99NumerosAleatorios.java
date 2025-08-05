package com.faleite.cursojava.aula85_100;

import java.util.Random;

public class Aula99NumerosAleatorios {

    public static void main(String[] args) {

        // A Classe Math tem seus métodos como estáticos
        // Por isso podemos acessalos sem precisar instanciar sua classe

        // Para gerar um numero entre 0 e 10
        System.out.println(Math.floor(Math.random() * 10)); // 5.0

        // Para gerar um numero entre 0 e 100
        System.out.println(Math.floor(Math.random() * 100)); // 10.0

        Random aleatorio = new Random();

        // Gera um número aleatório que seja inteiro
        System.out.println(aleatorio.nextInt()); // 993841427

        // Gera um número aleatório entre 0 e 100
        System.out.println(aleatorio.nextInt(100 + 1)); // 79
    }
}
