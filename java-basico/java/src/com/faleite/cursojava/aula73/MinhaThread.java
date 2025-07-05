package com.faleite.cursojava.aula73;

public class MinhaThread implements Runnable {

    private String nome;
    private boolean estaSuspensa;
    private boolean foiTerminada;

    public MinhaThread(String nome) {
        this.nome = nome;
        this.estaSuspensa = false;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {

        System.out.println("Executando " + this.nome);

        try {
            for (int i = 0; i < 10; i++){
                System.out.println("Thread " + nome + ", " + i);
                Thread.sleep(300);

                // Sincroniza o objeto
                synchronized (this){
                    while (estaSuspensa){
                        wait();
                    }
                    if (this.foiTerminada){
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread " + this.nome + " terminada.");
    }

    void suspend(){
        this.estaSuspensa = true;
    }

    synchronized void resume(){
        this.estaSuspensa = false;
        notify();
    }

    synchronized void stop(){
        this.foiTerminada = true;
        notify();
    }
}
