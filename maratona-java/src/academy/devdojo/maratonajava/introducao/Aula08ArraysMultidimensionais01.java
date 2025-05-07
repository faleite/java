package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] arrays = new int[3][3];

        arrays[0][0] = 1;
        arrays[0][1] = 2;
        arrays[0][2] = 3;

        arrays[1][0] = 4;
        arrays[1][1] = 5;
        arrays[1][2] = 6;

        arrays[2][0] = 7;
        arrays[2][1] = 8;
        arrays[2][2] = 9;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.println(arrays[i][j]);
            }
        }

        System.out.println("----------------------------");

        for (int[] arrBase : arrays) {
            for (int num : arrBase) {
                System.out.println(num);
            }
            System.out.println();
        }
    }
}
