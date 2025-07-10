package com.faleite.cursojava.aula75_84;

public class Aula82 {

    public static void main(String[] args) {

        // Argumentos do tipo Vargs
        String alfabeto = String.join(", ", "A", "B", "C", "D");

        System.out.println(alfabeto); // A, B, C, D

        String[] letras = alfabeto.split(", ");
        for (String letra : letras){
            System.out.println(letra);
            /*
              A
              B
              C
              D
            */
        }

        String doArquivo = "1;Antônio;30";
        String[] infos = doArquivo.split(";");
        Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]),
                                    infos[1], Integer.parseInt(infos[2]));
        System.out.println(pessoa); // Pessoa{cod=1, nome='Antônio', idade=30}

        for (String info : infos){
            System.out.println(info);
            /*
              1
              Antônio
              30
            */
        }

    }
}