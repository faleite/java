package com.faleite.cursojava.aula25;

public class TestCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println("Marca do carro: " + van.marca);
        System.out.println("Modelo do carro: " + van.modelo);

        van.exibirAutonomia();
    }
}
