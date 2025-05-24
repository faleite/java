package com.faleite.cursojava.aula25;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double consumoCombustivel;
    double capCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + (capCombustivel * consumoCombustivel) + " km");
    }

    double obterAutonomia(){
        System.out.println("Método autonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }
}
