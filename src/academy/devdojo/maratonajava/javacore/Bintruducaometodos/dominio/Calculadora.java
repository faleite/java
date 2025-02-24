package academy.devdojo.maratonajava.javacore.Bintruducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtracaoDoisNumeros(){
        System.out.println(20 - 10);
    }

    public void multiplicacaoDoisNumeros(int a, int b){
        System.out.println(a * b);
    }

    public double divisaoDoisNumeros(double a, double b){
        if (b == 0){
            return 0;
        }
        return a / b;
    }

    public void imprimeDivisaoDoisNumeros(double a, double b){
        if (b != 0){
            System.out.println(a / b);
            return;
        }
        System.out.println("Nao existe divisao por zero");
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }
}
