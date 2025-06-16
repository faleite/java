package com.faleite.cursojava.aula55;

import com.faleite.cursojava.aula53.DiaSemana;

public class TesteEnum2 {

    public static void main(String[] args) {

        // Lembre que enum também pode ser tratado como uma classe (ex: DiaSemana.class)
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        // Se você não souber mas tiver o valor de uma String você pode avaliar o valor desta string
        // transformando ela numa instancia do proprio enumerador
        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia); // out: DOMINGO
    }
}
