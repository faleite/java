package com.faleite.cursojava.aula24;

import java.util.Date;

public class Ex04 {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.nomeEmprestado = "Fabricio";

        System.out.println("Nome do Livro " + livro.nome);
    }
}
