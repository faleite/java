package com.faleite.cursojava.aula70;

import com.faleite.cursojava.aula68.MinhaThreadRunnable;

public class Teste {

    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);

        // LEMBRE DE INSTANCIAR AS THREADS
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        // MODIFICAR PRIORIDADE
        t1.setPriority(5); // o Atribulto pode ter valor de 1 a 10
        t2.setPriority(3);
        t3.setPriority(1);

        // Variaveis Constantes como atribulto
        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MIN_PRIORITY); // 1

        // USO DAS THREADS
        t1.start();
        t2.start();
        t3.start();

    }
}
