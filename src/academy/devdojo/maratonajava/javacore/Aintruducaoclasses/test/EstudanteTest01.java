package academy.devdojo.maratonajava.javacore.Aintruducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintruducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        // Variavel de referecia do tipo estudante
        // Objeto de referencia do tipo estudante
        Estudante estudante = new Estudante();
        estudante.nome ="Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante); // endereco de referencia do objeto estudante
    }
}
