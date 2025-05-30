package com.faleite.cursojava.aula35.recursivo;

public class TestFibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++){
            System.out.print(Fibonacci.calcular(i) + " ");
        }
    }
}
