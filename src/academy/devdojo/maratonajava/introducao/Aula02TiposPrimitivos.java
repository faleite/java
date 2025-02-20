package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, long, boolean
        // byte, short
        int age = 10;
        long numeroGrande = 10L;
        float numeroFracionario = 10.5f;
        double numeroDouble = 10.5;
        char inicial = '\u0041'; // (2 byte) poder ser ascii, unicode, e letra
        boolean verdadeiro = true; // No java temos nao pode por 1 ou 0
        boolean falso = false; // sempre temos que escrever 'true' ou 'false'
        short numeroPequeno = 10; // -32768 a 32767 (2 byte)
        byte numeroPequenoByte = 10; // -128 a 127 (1 byte)
        String nome = "Maratona"; // Tipo referencia
        System.out.println("A idade e " +age+ " anos");
        System.out.println("Char: " +inicial);
    }
}
