package academy.devdojo.maratonajava.introducao;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>.
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String name = "Fabricio Leite";
        String adress = "Prct Andre de Resende, 4";
        float salary = 1700.70F;
        String dateSalary = "30/06/2025";
        String message = "Eu " +name+", morando no endereço " +adress+ ", \n" +
                "confirmo que recebi o salário de " +salary+ ", na data " + dateSalary + ".";

        System.out.println(message);
    }
}
