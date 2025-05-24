package com.faleite.cursojava.aula24;

public class Ex05 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.println("Numero da Conta: " + conta.numero + " = " + conta.saldo);
    }
}
