package com.faleite.cursojava.aula34;

public class Calculadora {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static int potencia(int a, int b) {
        int total = 1;

        for (int i = 1; i <= b; i++) {
            total *= a;
        }
        return total;
        //return (int) Math.pow(a, b);
    }

    //5! = 5 * 4 * 3 * 2 * 1 = 120
    public static int fatorial(int a) {

        if (a == 0 || a == 1) { return 1; }

        int resultado = a;

        while (a > 1){
            a--;
            resultado *= a;
        }
        return resultado;
    }

    /*
    * fatorial(5) = 5 * fatorial(4)
    * fatorial(4) = 4 * fatorial(3)
    * fatorial(3) = 3 * fatorial(2)
    * fatorial(2) = 2 * fatorial(1)
    * fatorial(1) = 1 * fatorial(0)
    * fatorial(0) = 1;
    * */
    public static int recursiveFatorial(int number) {
        if (number == 0) { return 1; }
        return number * recursiveFatorial(number - 1);
    }
}
