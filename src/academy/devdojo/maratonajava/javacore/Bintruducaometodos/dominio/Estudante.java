package academy.devdojo.maratonajava.javacore.Bintruducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime() {
//        System.out.println("Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo);
        System.out.println("\n------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
