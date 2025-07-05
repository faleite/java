package com.faleite.cursojava.aula74;

public class Deadlock {

    public static void main(String[] args) {

        final String RECURSO1 = "Recusro #1";
        final String RECURSO2 = "Recusro #2";

        Thread t1 = new Thread(){
            public  void run(){
                synchronized (RECURSO1) {
                    System.out.println("Thread #1: bloqueou o recurso 1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Thread #1: tentando o acesso ao recurso 2");

                    synchronized (RECURSO2){
                        System.out.println("Thread #1: bloqueou o recurso 2");
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            public  void run(){
                synchronized (RECURSO2) {
                    System.out.println("Thread #2: bloqueou o recurso 2");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Thread #2: tentando o acesso ao recurso 1");

                    synchronized (RECURSO1){
                        System.out.println("Thread #2: bloqueou o recurso 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
