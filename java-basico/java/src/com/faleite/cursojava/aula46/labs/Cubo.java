package com.faleite.cursojava.aula46.labs;

public class Cubo extends Figura3D{

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double caucularArea() {
        return 6 * (lado * lado);
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }
}
