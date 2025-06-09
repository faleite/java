package com.faleite.cursojava.aula43.labs.ex01;

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

    /*public boolean sacar(double valor) {
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
    }*/

    public boolean sacar(double valor) {
        double saldoComLimite = super.getSaldo() + limite;

        if ((saldoComLimite - valor) >= 0) {
            super.setSaldo(super.getSaldo() - valor);
            return true;
        }
        return false;
    }

    public String toString() {
        String dados = "Conta Especial\n";
        dados += "Limite: " + limite;
        dados += ", Cliente: '" + super.getNomeCliente() + '\'' +
                ", Numero da Conta: '" + super.getNumConta() + '\'' +
                ", saldo: " + super.getSaldo();

        return dados;
    }
}
