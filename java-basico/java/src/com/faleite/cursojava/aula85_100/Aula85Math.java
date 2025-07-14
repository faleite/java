package com.faleite.cursojava.aula85_100;

public class Aula85Math {

    public static void main(String[] args) {

        // Potência
        System.out.println(Math.pow(2, 3)); // 8.0

        // Arredondamento //
        System.out.println(Math.round(4.7)); // 5

        System.out.println(Math.round(4.4)); // 4

        // sempre arredenda para cima
        System.out.println(Math.ceil(4.4)); // 5.0

        System.out.println(Math.ceil(4.7)); // 5.0

        // sempre arredenda para baixo
        System.out.println(Math.floor(4.4)); // 4.0

        System.out.println(Math.floor(4.7)); // 4.0

        // Gerar numero aleatorio //
        /* Existe a classe Random() para gera números aleatórios */
        System.out.println(Math.random()); // 0.2368432474848562

        // exemplo arredonda e gera entre 0 e 1
        System.out.println(Math.round(Math.random())); // 0 ou 1

        // exemplo arredonda e gera entre 0 e 10
        System.out.println(Math.round(Math.random() * 10)); // 8

        // exemplo arredonda e gera entre 0 e 100
        System.out.println(Math.round(Math.random() * 100)); // 59

        // Funções trigonométricas //
        /* Os valores não estao arredondado. Para isso utiliza
        * as classes BigNumber() e BgiDecimal para trabalhar com operações matemmaticas */
        // Calcula o seno com graus
        System.out.println(Math.sin(Math.toRadians(30))); //0.49999999999999994

        // Calcula o coseno com graus
        System.out.println(Math.cos(Math.toRadians(1))); // 0.9998476951563913

        // Calcula a tangente com graus
        System.out.println(Math.tan(Math.toRadians(45))); // 0.9999999999999999


    }
}
