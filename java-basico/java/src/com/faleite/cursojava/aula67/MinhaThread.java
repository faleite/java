package com.faleite.cursojava.aula67;

public class MinhaThread extends Thread {

    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        // #2 Tornar a thread pronta para execução
        start();
    }

    // Sobrescrita do método, aqui é feita a ação da thread
    public void run(){
        //System.out.println("Executando a Thread");

            try {
                for (int i =0; i <6; i++) {
                    System.out.println(nome + " contador " + i);
                    Thread.sleep(tempo);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        System.out.println(nome + " terminou a execução");
        }
}
