package com.faleite.cursojava.aula54;

public enum DiaSemana {

    SEGUNDA(1), TERCA(2), QUARTA(3),
    QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    private int valor;

    // Não é preciso modificadores de acesso (ex:_ public)
    // Porque o construtor é utilizado pelo próprio operador
    DiaSemana(int valor) { // O construtor que seta os valores das variaveis enum diretamente
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }
}
