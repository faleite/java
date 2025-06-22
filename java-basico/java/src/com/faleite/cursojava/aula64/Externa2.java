package com.faleite.cursojava.aula64;

public class Externa2 {

    public void metodoQaulquer() {

        class ClasseLocal{
            private String texto = "Texto classe local";

            public void imprimeTexto(){
                System.out.println(texto);
            }
        }

        ClasseLocal local = new ClasseLocal();
        local.imprimeTexto();
    }

    public static void main(String[] args) {

        Externa2 externa2 = new Externa2();

        externa2.metodoQaulquer(); // out: Texto classe local
    }
}
