package com.faleite.cursojava.aula75_84;

public class Aula75 {

    public static void main(String[] args) {

        // Construtor vazio
        String vazia = new String(); // ""
        System.out.println(vazia); // out:

        // Passando uma string para o construtor
        String java = new String("JAVA");
        System.out.println(java); // out: JAVA

        // Passando outra variavel do tipo string
        String java1 = new String(java);
        System.out.println(java1); // out: JAVA

        // Passando String(char[] value)
        char[] charsJava = {'J', 'A', 'V', 'A'};
        String java2 = new String(charsJava);
        System.out.println(java2); // out: JAVA

        // Passando String(char[] value, int offset, int count)
        char[] abcdef = {'A', 'B', 'C', 'D', 'E', 'F'};
        // offset (indice de inicio), count: (indice de fim)
        String abc = new String(abcdef, 1, 3);
        System.out.println(abc); // out: BCD

        // Passando String(byte[] bytes)
        byte[] ascii = {65, 66, 67, 68, 69};
        String abcde = new String(ascii);
        System.out.println(abcde); // out: ABCDE

        String bcd = new String(ascii, 1, 3);
        System.out.println(bcd); // out: BCD

        // Atribuição simples (direta)
        // Diferença
        String java3 = "JAVA";
        String java4 = "JAVA";
        System.out.println(java3); // out: JAVA
        System.out.println(java4); // out: JAVA

    }
}
