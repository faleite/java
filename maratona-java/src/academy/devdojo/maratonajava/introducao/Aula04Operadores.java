package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int number01 = 10;
        int number02 = 20;
        int result = number01 + number02;
        System.out.println(result);

        // Os dois primeiros números (number01 + number02) são somados porque o operador '+'
        // é usado aritmeticamente (10 + 20 = 30).
        // A partir de "Valor", o operador '+' é usado para concatenação, resultando em "30 Valor".
        // Então number01 e number02 (10 e 20) são convertidos para String e concatenados, formando "1020".
        // O resultado final é "30 Valor 1020".
        System.out.println(number01 + number02 + " Valor " + number01 + number02); // "30 Valor 1020".
        System.out.println(number01 + number02 + " Valor " + (number01 + number02)); // "30 Valor 30".

        // (condicao) ? verdadeiro : falso
        int value = 99;
        String resultado = value > 100 ? "Maior" : "Menor"; // Menor
        boolean isMaior100 = value > 100; // false

        System.out.println("Resultado: " +resultado);
        System.out.println("isMaior100: " +isMaior100);
    }
}
