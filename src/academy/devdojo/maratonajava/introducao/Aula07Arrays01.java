package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] arrayInt = null;
        int[] idades = new int[3]; // new cria uma nova instancia de uma array de tamho 3

        System.out.println(arrayInt); // null
        System.out.println(idades); // memory address
        System.out.println(idades[0]); // 0
        System.out.println(idades[1]); // 0
        System.out.println(idades[2]); // 0
//        System.out.println(idades[3]); // ERROR

        // Foreach
        int[] numeros = {1, 2,3};

        for (int num : numeros) {
            System.out.println(num);
        }
    }
}