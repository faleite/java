package com.faleite.cursojava.aula68;

public class Teste {

    // Este é um programa Java (processo) com 3 tarefas (threads)
    // sendo executada dentro do seu pŕoprio tempo
    public static void main(String[] args) {

        // Esta classe não é de fato uma Thread
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 900);

        /*
        É PRECISO PASSAR PARA A THREAD, no caso podemos fazer este processo direto na classe
        Thread t1 = new Thread(thread1);
        Em seguida passe o método start()
        t1.start();
         */

        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 600);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1100);

    }
}
