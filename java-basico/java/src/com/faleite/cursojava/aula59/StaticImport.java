package com.faleite.cursojava.aula59;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
// import static java.lang.Math.*; // importa todos os métodos da classe Math

public class StaticImport {

    public static void main(String[] args) {

        double a = 2;
        double b = 3;
        double c = 4;

        // Elevar um numero ao outro (potência)
        System.out.println(Math.pow(a, b)); // out: 8.0

        // Raiz quadrada
        System.out.println(Math.sqrt(c)); // out: 2.0

        System.out.println(pow(a, b)); // out: 8.0

        System.out.println(sqrt(c)); // out: 2.0

    }
}
