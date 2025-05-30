package com.faleite.cursojava.aula34;

public class Ex01 {

    static void imprimirContador() {
        System.out.println("Contador: " + Contador.getContador());
    }
    public static void main(String[] args) {
        imprimirContador();

        Contador.incrementar();

        imprimirContador();

        Contador.zerar();

        imprimirContador();

        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        imprimirContador();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        imprimirContador(); // Contador: 6

    }
}
