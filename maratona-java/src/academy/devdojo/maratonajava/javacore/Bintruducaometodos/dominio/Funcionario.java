package academy.devdojo.maratonajava.javacore.Bintruducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    //    public double[] salarios = new double[3];
    private double[] salarios;
    private double media;

    public void imprime() {
        System.out.println("Nome: " + this.nome + ", Idade: " + this.idade);
        if (salarios == null)
            return;
        System.out.print("Salarios: ");
        for (double salario : this.salarios) {
            System.out.print(salario + " ");
        }
        System.out.println();
        imprimeMediaSalarios();
    }

    public void imprimeMediaSalarios() {

        if (this.salarios == null)
            return;

//        int i = 0;
//        while (i < this.salarios.length){
//            media += this.salarios[i++];
//        }
//        double result = media / i;
        for (double salario : this.salarios) {
            media += salario;
        }
        media /= this.salarios.length;
        System.out.println("Média dos Salários: " + String.format("%.2f", media));
//            System.out.printf("Média dos Salários: %.2f%n", result);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}

// Primeira Versao
//public class Funcionario {
//    public String nome;
//    public byte idade;
//    //    public double[] salarios = new double[3];
//    public double[] salarios;
//
//    public void imprime() {
//        System.out.println("Nome: " + this.nome + ", Idade: " + this.idade);
//        if (salarios == null)
//            return;
//        System.out.print("Salarios: ");
//        for (double salario : this.salarios) {
//            System.out.print(salario + " ");
//        }
//        System.out.println();
//    }
//
//    public void mediaSalarios() {
//
//        if (this.salarios == null)
//            return;
//
//        double soma = 0;
////        int i = 0;
////        while (i < this.salarios.length){
////            soma += this.salarios[i++];
////        }
////        double result = soma / i;
//        for (double salario : this.salarios) {
//            soma += salario;
//        }
//        double result = soma / this.salarios.length;
//        System.out.println("Média dos Salários: " + String.format("%.2f", result));
////            System.out.printf("Média dos Salários: %.2f%n", result);
//    }
//}