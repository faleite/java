package com.faleite.cursojava.aula42;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        Pessoa aluno = new Aluno();
//        Pessoa professor = new Professor();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        System.out.println(Constantes.URL_BLOG);
        //Constantes.URL_BLOG = "nao pode modificar";
        System.out.println(Constantes.URL_BLOG);

        final int TOTAL = 1;
        // TOTAL += 1; // Nao pode
        System.out.println(TOTAL);

    }

}
