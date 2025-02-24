package academy.devdojo.maratonajava.javacore.Bintruducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintruducaometodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        // Variavel de referecia do tipo estudante
        // Objeto de referencia do tipo estudante
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome ="Luffy";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome ="Zoro";
        estudante02.idade = 20;
        estudante02.sexo = 'M';


        estudante01.imprime();
        estudante02.imprime();
    }
}
