package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        // Imprimir dia da semana considerando 1 como domingo
        // o case pode ser: char, int, byte, short, enum, String (Java 8)
        byte dia = 2;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }

        String sexo = "Feminino";
        switch (sexo) {
            case "Feminino":
                System.out.println("Mulher");
                break;
            case "Masculino":
                System.out.println("Homem");
                break;
            default:
                System.out.println("Sexo invalido");
                break;
        }

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia Util");
                break;
            default:
                System.out.println("Dia invalido");

        }
    }
}
