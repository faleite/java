package com.faleite.cursojava.aula35.recursivo;

public class Somatorio {

    /*
    * 5 = 5 + 4 + 3 + 2 + 1 = 15
    *
    * 5 = 5 + somar(4)
    * 4 = 4 + somar(3)
    * 3 = 3 + somar(2)
    * 2 = 2 + somar(1)
    * 1 = 1 + somar(0)
    * */
    public static int somar(int n) {
        if (n == 1) { return n; }
        return n + somar(n - 1);
    }
}
