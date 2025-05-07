package academy.devdojo.maratonajava.javacore.Aintruducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintruducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";
        carro1.ano = 1969;
        carro1.modelo = "Sport";

        carro2.nome = "Mustang";
        carro2.ano = 1968;
        carro2.modelo = "GT 500";

//      Copia do objeto do mesmo tipo por referencia
//      carro1 = carro2;
//      carro2 = carro1;

        System.out.println("Carro 1 -> Nome: " + carro1.nome + ", Ano: " + carro1.ano + ", Modelo: " + carro1.modelo);
        System.out.println("Carro 2 -> Nome: " + carro2.nome + ", Ano: " + carro2.ano + ", Modelo: " + carro2.modelo);
    }
}
