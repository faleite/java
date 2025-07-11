package com.faleite.cursojava.aula68;

public class MinhaThreadRunnable implements Runnable {

    private String nome;
    private int tempo;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;

        // Como esta classe não representa uma Thread,
        // mas sim uma instância de execução de uma thread
        // criamos a threrad e passamos a instancia para o contrutor:
        //Thread t = new Thread(this);
        //t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++){
                System.out.println(nome + " contatdor " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nome + " terminou a execução");
    }
}
