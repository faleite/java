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
}
