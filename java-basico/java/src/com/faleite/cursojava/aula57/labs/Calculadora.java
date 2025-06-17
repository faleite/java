package com.faleite.cursojava.aula57.labs;

public class Calculadora {

    enum Operacao{
        SOMAR("+") {
            @Override
            public double executarOperacao(double x, double y) {
                return x + y;
            }
        }, SUBTRAIR("-") {
            @Override
            public double executarOperacao(double x, double y) {
                return x - y;
            }
        }, MULTIPLICAR("*") {
            @Override
            public double executarOperacao(double x, double y) {
                return x * y;
            }
        }, DIVIDIR("/") {
            @Override
            public double executarOperacao(double x, double y) {

                if (x == 0 || y == 0)
                    return 0;
                return x / y;
            }
        };

        private String simbolo;

        Operacao(String simbolo) {
            this.simbolo = simbolo;
        }

        public abstract double executarOperacao(double x, double y);

        @Override
        public String toString() {
            return simbolo;
        }
    }

    public static void main(String[] args) {
        double y = 2.0;
        double x = 3.0;

        for (Operacao op : Operacao.values()){
            System.out.print(x + " ");
            System.out.print(op.toString() + " ");
            System.out.print(y + " = ");
            System.out.println(op.executarOperacao(x, y));
        }

        System.out.println("Operação individual (dividir):");
        System.out.println(x + " " + Operacao.DIVIDIR + " " + y + " = " + Operacao.DIVIDIR.executarOperacao(x, y));

        System.out.println(Enum.valueOf(Operacao.class, "SOMAR"));

    }
}
