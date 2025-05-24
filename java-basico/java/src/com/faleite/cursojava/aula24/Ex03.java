package com.faleite.cursojava.aula24;

public class Ex03 {
    public static void main(String[] args) {
        LivroLivraria livro = new LivroLivraria();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        livro.preco = 63.39;

        System.out.println("Nome do Livro " + livro.nome);
        System.out.println(livro.autor);
        System.out.println(livro.anoLancamento);
    }
}
