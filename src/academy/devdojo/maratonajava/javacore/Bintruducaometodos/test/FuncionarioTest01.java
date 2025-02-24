package academy.devdojo.maratonajava.javacore.Bintruducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintruducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Maria";
        funcionario.idade = 25;
        funcionario.salarios = new double[]{1200, 987.32, 2000, 5000};

        funcionario.imprime();
        funcionario.mediaSalarios();
    }
}
