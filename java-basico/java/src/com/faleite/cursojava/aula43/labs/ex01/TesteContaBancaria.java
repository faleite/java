package com.faleite.cursojava.aula43.labs.ex01;

public class TesteContaBancaria {

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso. Novo saldo: " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + ", Saldo de: " + conta.getSaldo());
        }
    }

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Fabricio", "001-123");
        ContaPoupanca contaPoupanca = new ContaPoupanca("Fabricio", "001-123/500");
        ContaEspecial contaEspecial = new ContaEspecial("Fabricio", "001-127");

        System.out.println("---------------CONTA SIMPLES---------------------");
        contaBancaria.depositar(20.50);
        realizarSaque(contaBancaria, 15.25);
        System.out.println(contaBancaria);


        System.out.println("-------------CONTA POUPANÇA-----------------------");
        contaPoupanca.depositar(50);
        contaPoupanca.setDiaRendimento(7);
        if (contaPoupanca.calcularNovoSaldo(0.5)){
            System.out.println("Saldo da conta poupanca com rendimento: " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento");
        }
        System.out.println(contaPoupanca);
        realizarSaque(contaPoupanca, 70);

        System.out.println("-------------CONTA ESPECIAL----------------");
        contaEspecial.setLimite(50);
        contaEspecial.depositar(100);
        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 80);
        System.out.println(contaEspecial);

    }
}
