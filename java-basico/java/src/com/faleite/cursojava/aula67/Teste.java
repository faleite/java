package com.faleite.cursojava.aula67;

public class Teste {

    public static void main(String[] args) {

        // #1 Criação de uma nova thread
        MinhaThread thread = new MinhaThread("Thread #1", 600);

        MinhaThread thread2 = new MinhaThread("Thread #2", 900);

        MinhaThread thread3 = new MinhaThread("Thread #3", 500);

        // #2 Tornar a thread pronta para execução
        // Isto executa o método run();
        // Obs: você pode colocar este método dentro do próprio construtor
        // thread.start();
    }
}
