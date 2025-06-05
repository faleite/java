package com.faleite.cursojava.aula43.labs;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(double limite) {
    }

    public ContaEspecial(String nomeCliente, String numConta) {
        super(nomeCliente, numConta);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor) {
        double saldoAtual = super.getSaldo();

        if (saldoAtual >= valor) {
            super.setSaldo(saldoAtual - valor);
            return true;
        }

        if (limite + super.getSaldo() >= valor) {
            limite = limite - (valor - saldoAtual);
            super.setSaldo(0);
            return true;
        }
        return false;
    }

    public String toString() {
        String dados = super.toString();

        dados += ", Limite: " + limite;
        return dados;
    }
}
