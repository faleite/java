package com.faleite.cursojava.aula69;

import com.faleite.cursojava.aula68.MinhaThreadRunnable;

public class Teste3 {

    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 700);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 800);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();

        /*try{
            // O join espera a execução da thread para continuar a execução do código
            // ou então passar o parametro ("tempo" ms) de espera para iniciar a proxima thread
            t1.join(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        t2.start();

        /*try {
            // O join espera a execução da thread para continuar a execução do código
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        t3.start();


        // Espera as 3 threads acabarem para finalizar o programa (finalizar a thread main)
        // Garante que a menssagem abaixo sera impressa no final do programa
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Programa finalizado");
    }
}
