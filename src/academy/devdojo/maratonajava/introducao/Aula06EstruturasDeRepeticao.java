package academy.devdojo.maratonajava.introducao;

// imprima todos os numeros pares de 0 a 10
public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        int nbr = 0;
        while(nbr <= 10){
            if (nbr % 2 == 0){
                System.out.println(nbr);
            }
            nbr++;
        }

        for (int i = 0; i <= 10; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
