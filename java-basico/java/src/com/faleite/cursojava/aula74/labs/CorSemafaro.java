package com.faleite.cursojava.aula74.labs;

public enum CorSemafaro {
    VERDE(1000), AMARELO(300), VERMELHO(200);

    private int tempoEspera;

    CorSemafaro(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
}
