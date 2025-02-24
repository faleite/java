package academy.devdojo.maratonajava.javacore.Bintruducaometodos.dominio;

public class Funcionario {
    public String nome;
    public byte idade;
    //    public double[] salarios = new double[3];
    public double[] salarios;

    public void imprime() {
        System.out.println("Nome: " + this.nome + ", Idade: " + this.idade);
        if (salarios == null)
            return;
        System.out.print("Salarios: ");
        for (double salario : this.salarios) {
            System.out.print(salario + " ");
        }
        System.out.println();
    }

    public void mediaSalarios() {

        if (this.salarios == null)
            return;

        double soma = 0;
//        int i = 0;
//        while (i < this.salarios.length){
//            soma += this.salarios[i++];
//        }
//        double result = soma / i;
        for (double salario : this.salarios) {
            soma += salario;
        }
        double result = soma / this.salarios.length;
        System.out.println("Média dos Salários: " + String.format("%.2f", result));
//            System.out.printf("Média dos Salários: %.2f%n", result);
    }
}