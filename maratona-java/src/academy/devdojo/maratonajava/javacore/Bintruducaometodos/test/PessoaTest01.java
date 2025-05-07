package academy.devdojo.maratonajava.javacore.Bintruducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintruducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "Jiraya";
//        pessoa.idade = -1;
        pessoa.setNome("Jiraya");
        pessoa.steIdade(70);
//        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
