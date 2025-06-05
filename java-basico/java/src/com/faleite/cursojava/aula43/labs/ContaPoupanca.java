package com.faleite.cursojava.aula43.labs;

public class ContaPoupanca extends ContaBancaria {
    private double diaRendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nomeCliente, String numConta) {
        super(nomeCliente, numConta);
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo() {
        double saldoAtualizado = super.getSaldo();
        saldoAtualizado += (saldoAtualizado * diaRendimento) / saldoAtualizado;

        super.setSaldo(saldoAtualizado);
    }

    public String toString() {
        String dados = super.toString();

        dados += ", Taxa Poupanca: " + diaRendimento;
        return dados;
    }
}
