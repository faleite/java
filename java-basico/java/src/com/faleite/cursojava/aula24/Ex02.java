package com.faleite.cursojava.aula24;

public class Ex02 {
    public static void main(String[] args){
        Livro livro = new Livro();

        livro.nome = "Mastering Java";
        livro.autor = "<NAME>";
        livro.qtdPaginas = 450;
        livro.anoLancamento = 2018;
        livro.isbn = "978-3-16-148410-0";

        System.out.println("Nome do Livro " + livro.nome);
        System.out.println(livro.autor);
        System.out.println(livro.qtdPaginas);
        System.out.println(livro.anoLancamento);
        System.out.println(livro.isbn);
    }
}
