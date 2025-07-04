package com.faleite.cursojava.aula71;

public class Calculadora {

    private int soma;

    /*
    * Temos duas thread acessando o mesmo recurso (var: soma)
    * isto faz return soma -> receber valores variados
    * a palavra reservada "synchronized" faz com que apenas
    * uma thread pode acessar este método por vez,
    * resolvendo este problema.
    */
    public synchronized int somaArray(int[] array){

        soma = 0;

        for (int num : array){
            soma += num;

            System.out.println("Executandoa soma " + Thread.currentThread().getName() +
                    " somando o valor " + num + " com total de " + soma); // mostra a thread atual

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return soma;
    }
}
