package academy.devdojo.maratonajava.javacore.Bintruducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintruducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtracaoDoisNumeros();
        calculadora.multiplicacaoDoisNumeros(2, 3);
        double result = calculadora.divisaoDoisNumeros(20, 0);
        System.out.println(result);

        calculadora.imprimeDivisaoDoisNumeros(30, 3);
    }
}
