package com.faleite.cursojava.aula43.labs;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nomeCliente, String numConta) {
        super(nomeCliente, numConta);
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    /*public void calcularNovoSaldo() {
        double saldoAtualizado = super.getSaldo();
        saldoAtualizado += (saldoAtualizado * diaRendimento) / saldoAtualizado;

        super.setSaldo(saldoAtualizado);
    }*/

    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            super.setSaldo(super.getSaldo() + (super.getSaldo() * taxaRendimento / 100));
            return true;
        }
        return false;
    }

    public String toString() {
        String dados = "Conta Poupança\n";
        dados += "Dia de Rendimento: " + diaRendimento;
        dados += ", Cliente: '" + super.getNomeCliente() + '\'' +
                ", Numero da Conta: '" + super.getNumConta() + '\'' +
                ", saldo: " + super.getSaldo();

        return dados;
    }
}
