package com.faleite.cursojava.aula34;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        do {
            System.out.println("Entre com um número positivo:");
            num = scan.nextInt();

            if (num < 0){
                System.out.println("Número inválido, tente novamente");
            }
        } while (num < 0);

        printResult(Calculadora.recursiveFatorial(num));
    }

    static void printResult(int result){
        System.out.println(result);
    }
}
