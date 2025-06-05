package com.faleite.cursojava.aula43.labs;

import java.util.Scanner;

public class TesteContaBancaria {


    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Fabricio", "001-123");
        ContaPoupanca contaPoupanca = new ContaPoupanca("Fabricio", "001-123/500");
        ContaEspecial contaEspecial = new ContaEspecial("Fabricio", "001-123/500");

        contaEspecial.setLimite(150);

        contaBancaria.depositar(20.50);
        contaPoupanca.depositar(20.50);
        contaEspecial.depositar(20.50);

        if (contaBancaria.sacar(15.25)) {
            System.out.println("Saque efetuado com sucesso. Novo saldo: " + contaBancaria.getSaldo());
        } else {
            System.out.println("Saldo insuficiente");
        }

        if (!contaPoupanca.sacar(16.25)) {
            System.out.println("Saque efetuado com sucesso. Novo saldo: " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Saldo insuficiente");
        }

        if (!contaEspecial.sacar(156.25)) {
            System.out.println("Saque efetuado com sucesso. Novo saldo: " + contaEspecial.getSaldo());
        } else {
            System.out.println("Saldo insuficiente");
        }

        contaPoupanca.setDiaRendimento(0.5);

        contaPoupanca.calcularNovoSaldo();
        System.out.println("Saldo da conta poupanca com rendimento: " + contaPoupanca.getSaldo());


        System.out.println(contaBancaria +"\n------------------------------------");

        System.out.println(contaPoupanca + "\n------------------------------------");

        System.out.println(contaEspecial);

//        public static void realizarSaque(conta) {
//            if (contaBancaria.sacar(15.25)) {
//                System.out.println("Saque efetuado com sucesso. Novo saldo: " + contaBancaria.getSaldo());
//            } else {
//            System.out.println("Saldo insuficiente");
//            }
//        }
    }
}
