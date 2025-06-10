package com.faleite.cursojava.aula46.labs;

public class Piramide extends Figura3D{

    private double altura;
    private double arestaBase;
    private double apotema;
    private int numPoliBase;

    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    private Figura2D base;

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double caucularArea() {
        if (base != null){
            return ((numPoliBase * (arestaBase * apotema)) / 2) + base.caucularArea();
        }
        return 0;
    }

    @Override
    public double calcularVolume() {
        if (base != null){
            return (base.caucularArea() * altura) / 3;
        }
        return 0;
    }
}
