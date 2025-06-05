package com.faleite.cursojava.aula43;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setCurso("Ciência da Computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "fabricio";
        String s2 = "Fabricio";
        System.out.println(s1.equals(s2)); // this return false
        System.out.println(s1.equalsIgnoreCase(s2)); // this return true

        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Ciência da Computação");
        double[] notas2 = {10, 9, 8, 7};
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));
    }

}
